package beansForWorkBD;

import interfaces.ConnectionBidDB;
import model.*;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.model.DualListModel;
import org.primefaces.model.TreeNode;
import sessionsBidDB.IdKontragentovM;
import sessionsBidDB.ReestrIzdaniiM;
import sessionsBidDB.SparovochnikPantone;
import spravochnik.FormirovanieSpiskaKomponent;
import spravochnik.SpisokComponent;
import testovie.TestSpisokOtdelok;
import tree.ClassNodeTreeMy;
import tree.ListOfTree;
import tree.NodeTreeMy;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


//import testovie.TestBymaga;

public class CreateEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    //основные переменные
    private boolean showLeftMenu;
    private List<String> spisokRecomObor;
    private List<SpisokComponent> spisokKomponent;
    private boolean filterKontragentov = false;
    private boolean filterIzdanii = false;
    private List<IdKontragentov> zakazchikiList;
    private List<ReestrIzdanii> spisokIzdanii;
    private ReestrIzdanii izdanieContrAgent;
    private ReestrIzdanii izdanie;
    private String formatBykvi = "";
    private Pantonespravochnik pantonLico;
    private Pantonespravochnik pantonOborot;
    private Date bufData1 = new Date();
    private Date bufData2 = new Date();
    private int indexPantoniLico = 0;
    private int indexPantoniOborot = 0;
    private int indexLakovLico = 0;
    private int indexLakovOborot = 0;
    private int indexOtdelkiComponenti = 0;
    private int colOtdelok = 1;
    private int colOperacii = 1;
    private int indexOperacii = 0;
    private boolean showTiraj = true;
    private List<Date> dostavkaDate;
    private Object buferMainClass;
    private String showedPage = "/calculatorPage/idzayavki/idzayavki.xhtml";
    private int groupOfList = 0;
    private Ypakovkagotovogoizdeliya ypakovka;
    private model.Ykladkanapaleti ykladka;
    private Dostavkasignalov signali;
    private List<Dostavka> dostavka;
    private NodeTreeMy buferTreenode;
    private NodeTreeMy treeNode;
    private NodeTreeMy zayavka;
    private NodeTreeMy componentiGroup;
    private NodeTreeMy podeizdanieGroup;
    private NodeTreeMy materiali;
    private NodeTreeMy selection;
    private ConnectionBidDB connectionBidDBtoZakazchik = new IdKontragentovM();
    private ConnectionBidDB connectionBidDBtoReestrIzdanii = new ReestrIzdaniiM();
    private Idzayavki idZayavki;
    private Componenti componenta;
    private Componenti defaultComponenti;
    private List<String> kraskiComponentiLico;
    private List<String> kraskiComponentiOborot;
    private DualListModel<String> componentiListModel;
    private List<Pantoninamashine> pantoniLico;
    private List<Pantoninamashine> pantoniOborot;
    private List<Lakirovanienamashine> lakLico;
    private List<Lakirovanienamashine> lakOborot;
    private List<Otdelkacomponenti> otdelkaComponenti;
    private List<Operaciisgotovimizdeliem> operaciiNadIzdeliem;
    private List<TestSpisokOtdelok> testSpisokOtdelok;
    private List<Pantonespravochnik> spravochnikPantonov;
    private List<String> spisokPPKDav;
    private Podizdaniya podizdaniya;
    private Dopizdelie dopIzdelie;
    private List<ReestrIzdanii> allSpisokIzdanii;
    private List<String> spisokTipodizdeliya;

    public CreateEntity() {
    }

    //Тестовый список отделок  = компоненты
    private List<TestSpisokOtdelok> createSpisokOtdelok() {
        List<TestSpisokOtdelok> bufSpisok = new ArrayList<>();
        bufSpisok.add(new TestSpisokOtdelok(1, "Листовая", "Фольгирование"));
        bufSpisok.add(new TestSpisokOtdelok(1, "Листовая", "Вырубка"));
        bufSpisok.add(new TestSpisokOtdelok(1, "Листовая", "Лакирование Colibri"));
        return bufSpisok;
    }


    //Работа с диалогом
    //Выбор контр агента
    public void viborContrAgenta() {
        if (!filterIzdanii) {
            if (idZayavki.getIdKontragenta() == (-1)) {
                System.out.println("ПОЛНЫЙ СПИСОК");
                spisokIzdanii = new ArrayList<>();
                spisokIzdanii = connectionBidDBtoReestrIzdanii.getEntities();
                System.out.println(spisokIzdanii);
                filterKontragentov = false;
                idZayavki.setNazvanieIzdaniya("1");
            } else {
                filterKontragentov = true;
                spisokIzdanii = connectionBidDBtoReestrIzdanii.getEntities("SELECT o FROM ReestrIzdanii o WHERE o.idKontrAgent = :idKontrAgent OR o.idKontrAgent IS NULL",
                        "idKontrAgent", idZayavki.getIdKontragenta());

            }
        }
    }

    //Выбор изданий
    public void viborIzdanii() {
        if (!filterKontragentov) {
            if ((idZayavki.getIdIzdanie() == 1)) {
                System.out.println("ПОЛНЫЙ СПИСОК");
                zakazchikiList = new ArrayList<>();
                zakazchikiList = connectionBidDBtoZakazchik.getEntities();
                System.out.println(zakazchikiList);
                filterIzdanii = false;
                idZayavki.setNazvanieIzdaniya("1");
            } else {
                filterIzdanii = true;
                List<ReestrIzdanii> rI = connectionBidDBtoReestrIzdanii.getEntities("SELECT o FROM ReestrIzdanii o WHERE o.idreestrIzdanii = :idreestr_izdanii",
                        "idreestr_izdanii", idZayavki.getIdIzdanie());
                idZayavki.setNazvanieIzdaniya(rI.get(0).getNameIzd());
                System.out.println();
                zakazchikiList = connectionBidDBtoZakazchik.getEntities("SELECT o FROM IdKontragentov o WHERE o.idagenta = :idKontragenta",
                        "idKontragenta", rI.get(0).getIdKontrAgent());
            }
        }
        List<ReestrIzdanii> rI = connectionBidDBtoReestrIzdanii.getEntities("SELECT o FROM ReestrIzdanii o WHERE o.idreestrIzdanii = :idreestr_izdanii",
                "idreestr_izdanii", idZayavki.getIdIzdanie());
        idZayavki.setNazvanieIzdaniya(rI.get(0).getNameIzd());
        System.out.println(idZayavki.getNazvanieIzdaniya());
        if (zayavka != null) {
            ListOfTree listOfTree = (ListOfTree) zayavka.getData();
            listOfTree.setNameClass(idZayavki.getNazvanieIzdaniya() + " " + idZayavki.getCommentIzdanie());
        }
    }

    //Изменение формата
    public void chFormatBykvi() {

        if (formatBykvi.equals("A3")) {
            idZayavki.setFormat1(297);
            idZayavki.setFormat2(420);
        }
        if (formatBykvi.equals("A4")) {
            idZayavki.setFormat1(210);
            idZayavki.setFormat2(297);
        }
        if (formatBykvi.equals("A5")) {
            idZayavki.setFormat1(148);
            idZayavki.setFormat2(210);
        }
        if (formatBykvi.equals("A6")) {
            idZayavki.setFormat1(105);
            idZayavki.setFormat2(148);
        }
        if (formatBykvi.equals("B3")) {
            idZayavki.setFormat1(353);
            idZayavki.setFormat2(500);
        }
        if (formatBykvi.equals("B4")) {
            idZayavki.setFormat1(250);
            idZayavki.setFormat2(353);
        }
        if (formatBykvi.equals("B5")) {
            idZayavki.setFormat1(176);
            idZayavki.setFormat2(250);
        }
        if (formatBykvi.equals("B6")) {
            idZayavki.setFormat1(125);
            idZayavki.setFormat2(176);
        }
    }

    //Изменение типа бина
    public void chTipizdeliya() {
        TreeNode t = buferTreenode.getParent();
        ListOfTree listOfTree = (ListOfTree) t.getData();
        listOfTree.setNameClass(idZayavki.getTipIzdeliya());
    }

    // Метод создания бина
    @PostConstruct
    public void createNewBean() {
        showLeftMenu = false;
        spisokTipodizdeliya = new ArrayList<>();
        spisokTipodizdeliya.add("---");
        spisokTipodizdeliya.add("Журнальное издание КБС");
        spisokTipodizdeliya.add("Журнальное издание ВШРА");
        spisokTipodizdeliya.add("Издания с проклейкой корешка");
        spisokTipodizdeliya.add("Газетное издание со скреплением");
        spisokTipodizdeliya.add("Газетное издание без скрепления");
        spisokTipodizdeliya.add("Листовое издание без фальцовки");
        spisokTipodizdeliya.add("Листовое издание с фальцовкой");
        spisokTipodizdeliya.add("Ролевый полуфабрикат");
        spisokTipodizdeliya.add("Книжное издание");
        spisokTipodizdeliya.add("Календарь");
        idZayavki = new Idzayavki();
        idZayavki.setColComponent(1);
        idZayavki.setColPodizdanii(1);
        idZayavki.setFormat1(210);
        idZayavki.setFormat2(297);
        idZayavki.setCommentIzdanie("№ ");
        idZayavki.setTiraj(1000);
        idZayavki.setDateBegin(new Date());
        idZayavki.setDateEnd(new Date());
        idZayavki.setColDopIzdelii(0);
        idZayavki.setTipIzdeliya("---");
        izdanieContrAgent = new ReestrIzdanii();
        zakazchikiList = connectionBidDBtoZakazchik.getEntities();
        allSpisokIzdanii = connectionBidDBtoReestrIzdanii.getEntities();
        spisokIzdanii = allSpisokIzdanii;
//           newClass();
//    }
//
//    public String newClass() {
////        int zu = Integer.parseInt(idZayavki.getTipIzdeliya());
        // try {
       /*     spisokKomponent = new FormirovanieSpiskaKomponent(idZayavki.getTipIzdeliya()).getSpisok();
            List<ReestrIzdanii> rI = connectionBidDBtoReestrIzdanii.getEntities("SELECT o FROM ReestrIzdanii o WHERE o.idreestrIzdanii = :idreestr_izdanii",
                    "idreestr_izdanii", idZayavki.getIdIzdanie());*/
        idZayavki.setNazvanieIzdaniya("Разовый расчет");
        System.out.println(idZayavki.getNazvanieIzdaniya());
//        idZayavki.setTipIzdeliya(spisokTipodizdeliya.get(Integer.parseInt(idZayavki.getTipIzdeliya())));

        dopIzdelie = new Dopizdelie();
        ykladka = new Ykladkanapaleti();
        ypakovka = new Ypakovkagotovogoizdeliya();
        pantonLico = new Pantonespravochnik();
        spisokPPKDav = new ArrayList<>();
        spisokPPKDav.add("ППК");
        spisokPPKDav.add("Давальческое");
        try {
            interfaces.ConnectionBidDB<Pantonespravochnik> entityPantonespravochnikConnectionBidDB = new SparovochnikPantone();
            spravochnikPantonov = entityPantonespravochnikConnectionBidDB.getEntities();
        } catch (Exception e) {
            System.err.println("Ошибка " + e);

            spravochnikPantonov = new ArrayList<>();
        }

        testSpisokOtdelok = createSpisokOtdelok();
        //idZayavki = new Idzayavki();
        defaultComponenti = new Componenti();
        pantoniLico = new ArrayList<>();
        pantoniOborot = new ArrayList<>();
        //Переменная ИДЗаявки по умолчанию

        //Переменная компонента по умолчанию

        //Создаем деревоidZayavki.getTipIzdeliya()
        // componentiTree = new ArrayList<>();
        treeNode = new ClassNodeTreeMy(new ListOfTree("Издание", -1, "black"), null);
        treeNode.getChildren().add(new ClassNodeTreeMy(new ListOfTree("---", -1, "black"), treeNode));
        zayavka = new ClassNodeTreeMy(new ListOfTree(idZayavki.getNazvanieIzdaniya() + " " + idZayavki.getCommentIzdanie(), idZayavki, "/calculatorPage/idzayavki/idzayavki.xhtml", 0, "green"), treeNode.getChildren().get(0));
        System.out.println("Группа заявки = " + zayavka.getType());
        buferTreenode = zayavka;
        componentiGroup = new ClassNodeTreeMy(new ListOfTree("Компоненты", null, null, 2, "black"), zayavka);
        podeizdanieGroup = new ClassNodeTreeMy(new ListOfTree("Части издания", null, null, 3, "black"), zayavka);
        materiali = new ClassNodeTreeMy(new ListOfTree("Материалы", null, null, 4, "black"), zayavka);
        //Добавляем листья дерева по умолчанию
        for (int i = 0; i < idZayavki.getColComponent(); i++) {
            defaultComponenti = newComponenta();
            componentiGroup.getChildren().add(new ClassNodeTreeMy(new ListOfTree(defaultComponenti.getTipComponenti() + " " + (i + 1), defaultComponenti, "/calculatorPage/componenti/componenti.xhtml", 11, "green"), componentiGroup));
            //Добавляем данные в лист Компоненты
            NodeTreeMy nodeBymaga = (NodeTreeMy) componentiGroup.getChildren().get(componentiGroup.getChildren().size() - 1);
            nodeBymaga.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Бумага", new Bymaga(), "/calculatorPage/componenti/bymaga/bymagaTM.xhtml", 12, "green"), nodeBymaga));
        }
        for (int i = 0; i < idZayavki.getColPodizdanii(); i++) {
            Podizdaniya podizdaniya1 = new Podizdaniya();
            podizdaniya1.setCommentPodizdaniya("Часть издания " + (i + 1));
            podizdaniya1.setMaketPodizdaniya(false);
            podizdaniya1.setOperaciiSPodizdaniem(false);
            podizdaniya1.setSignaliPodizdanie(false);
            podizdaniya1.setTirajPodizdaniya(0);
            podizdaniya1.setColYpakovok(1);
            podeizdanieGroup.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Часть издания " + (i + 1), podizdaniya1, "/calculatorPage/podizdaniya/podizdanie.xhtml", 21, "green"), podeizdanieGroup));
            addPodizdanieList((i));
        }
        for (int i = 0; i < idZayavki.getColDopIzdelii(); i++) {
            chColDopIzdelii();
        }
        // return "/calculatorPage/createBid.xhtml";
        //  }catch (Exception e){
        // System.out.println("ОШИБКА");
        // return null;
        //  }
    }

    //----------------------------------------------------------
    //Метод изменение типа изделия
    public void chTipDopIzdeliya() {
        buferTreenode.getChildren().remove(checkGroups(2));
        buferTreenode.getChildren().add(0, new ClassNodeTreeMy(new ListOfTree("Компоненты", null, null, 2, "black"), buferTreenode));
        dopIzdelie.setTipIzdeliya(null);
        chColComponentDopIzdeliya();
    }

    //Методы создания доп изделия
    public void chColDopIzdelii() {
        if ((treeNode.getChildren().size() - 1) < idZayavki.getColDopIzdelii()) {
            int j = idZayavki.getColDopIzdelii() - (treeNode.getChildren().size() - 1);
            for (int i = 0; i < j; i++) {
                //Добавляем компоненты в основное издание

                //Добавление доп изделия в дерево
                Dopizdelie dopizdelieBuf = newDopIzdelie();
                dopizdelieBuf.setCommentIzdanie(("Доп изделие " + treeNode.getChildren().size()));
                int groupClass = treeNode.getChildren().size();
                treeNode.getChildren().add(new ClassNodeTreeMy(new ListOfTree(groupClass, dopizdelieBuf.getCommentIzdanie(), dopizdelieBuf, "/calculatorPage/dopIzdelie/idDopizdeliya.xhtml", 50, "red"), treeNode));
                NodeTreeMy bufDopIzdelie = (NodeTreeMy) treeNode.getChildren().get(treeNode.getChildren().size() - 1);

                //Добавление группы компоненты+самой компоненты
                bufDopIzdelie.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Компоненты", null, null, 2, "black"), bufDopIzdelie));
                NodeTreeMy bufComponenti = (NodeTreeMy) bufDopIzdelie.getChildren().get(bufDopIzdelie.getChildren().size() - 1);
                defaultComponenti = newComponenta();
                bufComponenti.getChildren().add(new ClassNodeTreeMy(new ListOfTree(defaultComponenti.getTipComponenti() + " " + defaultComponenti.getNazvanieComponenti(), defaultComponenti, "/calculatorPage/componenti/componenti.xhtml", 11, "green"), bufComponenti));
                //Группа части доп изделия
                //***************************************************
                bufDopIzdelie.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Части доп. изделия", null, null, 3, "black"), bufDopIzdelie));
                NodeTreeMy buferGroupPodizdanie = (NodeTreeMy) bufDopIzdelie.getChildren().get(checkGroups(3));
                Podizdaniya bufPodizdanie = newPodizdanieDopIzdelie();
                bufPodizdanie.setCommentPodizdaniya("Часть " + (buferGroupPodizdanie.getChildren().size() + 1));
                defaultComponenti = newComponenta();
                Componenti componentiDopIzdelie = defaultComponenti;
                componentiDopIzdelie.setNazvanieComponenti((dopizdelieBuf.getCommentIzdanie() + " " + bufPodizdanie.getCommentPodizdaniya()));
                componentiGroup.getChildren().add(new ClassNodeTreeMy(new ListOfTree(groupClass, buferGroupPodizdanie.getChildren().size(), componentiDopIzdelie.getNazvanieComponenti(), componentiDopIzdelie, "/calculatorPage/componenti/componentaDopIzdelie.xhtml", 51, "red"), componentiGroup));
                buferGroupPodizdanie.getChildren().add(new ClassNodeTreeMy(new ListOfTree(groupClass, buferGroupPodizdanie.getChildren().size(), bufPodizdanie.getCommentPodizdaniya(),
                        bufPodizdanie, "/calculatorPage/podizdaniya/podizdanieDopIzdeliya.xhtml", 21, "green"), buferGroupPodizdanie));
                buferGroupPodizdanie.getChildren().get(buferGroupPodizdanie.getChildren().size() - 1).getChildren().add(new ClassNodeTreeMy(new ListOfTree("Брошюровка", new Broshyrovkapodizdaniya(), "/calculatorPage/podizdaniya/broshyrovka/broshyrovkaTM.xhtml", 22, "green"), buferGroupPodizdanie.getChildren().get(buferGroupPodizdanie.getChildren().size() - 1)));
                //Добавление бумаги
                NodeTreeMy nodeBymaga = (NodeTreeMy) bufComponenti.getChildren().get(bufComponenti.getChildren().size() - 1);
                nodeBymaga.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Бумага", new Bymaga(), "/calculatorPage/componenti/bymaga/bymagaTM.xhtml", 12, "green"), nodeBymaga));
                //Добавление группы материалы
                bufDopIzdelie.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Материалы", null, null, 4, "black"), bufDopIzdelie));

            }
        }
        if ((treeNode.getChildren().size() - 1) > idZayavki.getColDopIzdelii()) {
            int j = (treeNode.getChildren().size() - 1) - idZayavki.getColDopIzdelii();
            for (int i = 0; i < j; i++) {
                ListOfTree listOfTree11 = (ListOfTree) treeNode.getChildren().get((treeNode.getChildren().size() - 1)).getData();
                int gigi = componentiGroup.getChildren().size();
                for (int z = (gigi - 1); z > 0; z--) {
                    ListOfTree listOfTree = (ListOfTree) componentiGroup.getChildren().get(z).getData();
                    if ((listOfTree.getNumbClass() == listOfTree11.getNumbClass()) && (listOfTree.getNumbClass() != (-1))) {
                        componentiGroup.getChildren().remove(z);
                    }
                }
                treeNode.getChildren().remove(treeNode.getChildren().size() - 1);
            }
        }
    }

    //Новый класс доп изделия
    private Dopizdelie newDopIzdelie() {
        Dopizdelie T = new Dopizdelie();
        T.setColComponent(1);
        T.setColPodizdanii(1);
        T.setDateBegin(new Date());
        T.setMaketIzdaniya(false);
        T.setOperaciiSIzdeliem(false);
        return T;
    }

    //Создание класса подиздания в доп изделии
    private Podizdaniya newPodizdanieDopIzdelie() {
        Podizdaniya T = new Podizdaniya();
        T.setMaketPodizdaniya(false);
        T.setOperaciiSPodizdaniem(false);
        T.setSignaliPodizdanie(false);
        T.setTirajPodizdaniya(0);
        T.setColYpakovok(1);
        T.setOtgryzka(false);
        return T;
    }

    //Добавление отгрузки
    public void addOtgryzki() {
        if (podizdaniya.getOtgryzka()) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Логистика", 30, "black"), buferTreenode));
//            NodeTreeMy bufPodizdanie = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(30));
//            int tt = 0;
//            for (int i = 0; i < bufPodizdanie.getChildren().size(); i++) {
//                ListOfTree buf = (ListOfTree) bufPodizdanie.getChildren().get(i).getData();
//                if (buf.getGroupList() == 30) {
//                    tt = i;
//                }
//            }
            NodeTreeMy bufNodeLogistik = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(30));
            addYpakovka(bufNodeLogistik);
        }
        if (!podizdaniya.getOtgryzka()) {
            buferTreenode.getChildren().get(checkGroups(30));
        }
    }

    //Добавление частей изделия
    public void chColPodizdaniiDopComponenti() {
        int colPodizdanii = dopIzdelie.getColPodizdanii();
        NodeTreeMy buferGroupPodizdanie = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(3));
        ListOfTree ll = (ListOfTree) buferTreenode.getData();
        int groupClass = ll.getNumbClass();
        if (colPodizdanii > buferGroupPodizdanie.getChildren().size()) {
            int buf = colPodizdanii - buferGroupPodizdanie.getChildren().size();
            for (int i = 0; i < buf; i++) {
                Podizdaniya bufPodizdanie = newPodizdanieDopIzdelie();
                bufPodizdanie.setCommentPodizdaniya("Часть " + (buferGroupPodizdanie.getChildren().size() + 1));
                Componenti componentiDopIzdelie = newComponenta();
                componentiDopIzdelie.setNazvanieComponenti((dopIzdelie.getCommentIzdanie() + " " + bufPodizdanie.getCommentPodizdaniya()));
                componentiGroup.getChildren().add(new ClassNodeTreeMy(new ListOfTree(groupClass, buferGroupPodizdanie.getChildren().size(), componentiDopIzdelie.getNazvanieComponenti(), componentiDopIzdelie, "/calculatorPage/componenti/componentaDopIzdelie.xhtml", 51, "red"), componentiGroup));
                buferGroupPodizdanie.getChildren().add(new ClassNodeTreeMy(new ListOfTree(groupClass, buferGroupPodizdanie.getChildren().size(), bufPodizdanie.getCommentPodizdaniya(),
                        bufPodizdanie, "/calculatorPage/podizdaniya/podizdanieDopIzdeliya.xhtml", 21, "green"), buferGroupPodizdanie));
                buferGroupPodizdanie.getChildren().get(buferGroupPodizdanie.getChildren().size() - 1).getChildren().add(new ClassNodeTreeMy(new ListOfTree("Брошюровка", new Broshyrovkapodizdaniya(), "/calculatorPage/podizdaniya/broshyrovka/broshyrovkaTM.xhtml", 22, "green"), buferGroupPodizdanie.getChildren().get(buferGroupPodizdanie.getChildren().size() - 1)));
                //--------------
            }
        }
        if (colPodizdanii < buferGroupPodizdanie.getChildren().size()) {
            int buf = buferGroupPodizdanie.getChildren().size() - colPodizdanii;
            for (int i = 0; i < buf; i++) {
                ListOfTree podizdanie = (ListOfTree) buferGroupPodizdanie.getChildren().get(buferGroupPodizdanie.getChildren().size() - 1).getData();
                int gigi = componentiGroup.getChildren().size();
                for (int z = (gigi - 1); z > 0; z--) {
                    ListOfTree listOfTree = (ListOfTree) componentiGroup.getChildren().get(z).getData();
                    if ((listOfTree.getNumbClass() == podizdanie.getNumbClass()) && (listOfTree.getNumbClass() != (-1)) && (listOfTree.getNumbGroup() == podizdanie.getNumbGroup())) {
                        componentiGroup.getChildren().remove(z);
                    }
                }
                buferGroupPodizdanie.getChildren().remove(buferGroupPodizdanie.getChildren().size() - 1);
            }
        }

    }

    //Изменение количества компонент в доп изделии
    public void chColComponentDopIzdeliya() {
        NodeTreeMy buferGroupComponent = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(2));
        if (dopIzdelie.getColComponent() > buferGroupComponent.getChildren().size()) {
            int buf = dopIzdelie.getColComponent() - buferGroupComponent.getChildren().size();
            for (int i = 0; i < buf; i++) {
                defaultComponenti = newComponenta();
                defaultComponenti.setNazvanieComponenti("" + (buferGroupComponent.getChildren().size() + 1));
                buferGroupComponent.getChildren().add(new ClassNodeTreeMy(
                        new ListOfTree((defaultComponenti.getTipComponenti() + " " + defaultComponenti.getNazvanieComponenti()),
                                defaultComponenti, "/calculatorPage/componenti/componenti.xhtml", 11, "green"), buferGroupComponent));
                NodeTreeMy nodeBymaga = (NodeTreeMy) buferGroupComponent.getChildren().get(buferGroupComponent.getChildren().size() - 1);
                nodeBymaga.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Бумага", new Bymaga(), "/calculatorPage/componenti/bymaga/bymagaTM.xhtml", 12, "green"), nodeBymaga));
            }
        }

        if (dopIzdelie.getColComponent() < buferGroupComponent.getChildren().size()) {
            int buf = buferGroupComponent.getChildren().size() - dopIzdelie.getColComponent();
            for (int i = 0; i < buf; i++) {
                buferGroupComponent.getChildren().remove(buferGroupComponent.getChildren().size() - 1);
            }
        }
    }

    //Изменение названия доп изделия
    public void chSamogoNazvanieDopIzdeliya() {
        ListOfTree listOfTree = (ListOfTree) buferTreenode.getData();
        listOfTree.setNameClass(dopIzdelie.getCommentIzdanie());
        NodeTreeMy spisokPodizdanii = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(3));
        for (int i = 0; i < spisokPodizdanii.getChildren().size(); i++) {
            ListOfTree podizdanie = (ListOfTree) spisokPodizdanii.getChildren().get(i).getData();
            for (int z = 0; z < componentiGroup.getChildren().size(); z++) {
                ListOfTree listOfTree1 = (ListOfTree) componentiGroup.getChildren().get(z).getData();
                if ((listOfTree1.getNumbClass() == podizdanie.getNumbClass()) && (listOfTree1.getNumbClass() != (-1)) && (listOfTree1.getNumbGroup() == podizdanie.getNumbGroup())) {
                    Podizdaniya tt = (Podizdaniya) podizdanie.getTypeList();
                    String st = dopIzdelie.getCommentIzdanie() + " " + tt.getCommentPodizdaniya();
                    Componenti comp = (Componenti) listOfTree1.getTypeList();
                    comp.setNazvanieComponenti(st);
                    listOfTree1.setTypeList(comp);
                    listOfTree1.setNameClass(st);
                }
            }
        }
    }

    //
    public void chNazvanieDopIzdeliya() {
        ListOfTree listOfTree = (ListOfTree) buferTreenode.getData();
        listOfTree.setNameClass(podizdaniya.getCommentPodizdaniya());
        for (int z = 0; z < componentiGroup.getChildren().size(); z++) {
            ListOfTree listOfTree1 = (ListOfTree) componentiGroup.getChildren().get(z).getData();
            if ((listOfTree1.getNumbClass() == listOfTree.getNumbClass()) && (listOfTree1.getNumbClass() != (-1)) && (listOfTree1.getNumbGroup() == listOfTree.getNumbGroup())) {
                ListOfTree listOfTreeBuf = (ListOfTree) componentiGroup.getChildren().get(z).getData();
                NodeTreeMy groupPodizdanii = (NodeTreeMy) buferTreenode.getParent();
                NodeTreeMy mainDopIzdelie = (NodeTreeMy) groupPodizdanii.getParent();
                ListOfTree dopIzdelie = (ListOfTree) mainDopIzdelie.getData();
                Dopizdelie samoIzdelie = (Dopizdelie) dopIzdelie.getTypeList();
                Componenti comp = (Componenti) listOfTreeBuf.getTypeList();
                String st = samoIzdelie.getCommentIzdanie() + " " + podizdaniya.getCommentPodizdaniya();
                listOfTreeBuf.setNameClass(st);
                comp.setNazvanieComponenti(st);
                listOfTreeBuf.setTypeList(comp);
            }
        }
    }
//----------------------------------------------------------

    //МЕТОДЫ РАБОТЫ С ДЕРЕВОМ
    //Смена элемента дерева
    public void saveMethod() {
    }


    //----------------------
    //Выбор элемента дерева
    public void chooseTree(NodeSelectEvent event) {
        //Параметр метода
        ListOfTree bufList = (ListOfTree) event.getTreeNode().getData();
        if (bufList.getPageForList() != null) {
            ListOfTree listOfTree;
            //действия метода
            //Сохранение изменений в дереве
            if (groupOfList == 0) {
                buferTreenode = (NodeTreeMy) treeNode.getChildren().get(0);
                idZayavki.setDateBegin(bufData1);
                idZayavki.setDateEnd(bufData2);
                listOfTree = (ListOfTree) buferTreenode.getData();
                listOfTree.setTypeList(idZayavki);
            }
            if (groupOfList == 11) {
                //System.out.println(componenta.getNazvanieComponenti());
                //buferTreenode = (NodeTreeMy) treeNode.getChildren().get(0);
                listOfTree = (ListOfTree) buferTreenode.getData();
                componenta.setKraskiComponentiLicoN(chKraskiIzListVString(kraskiComponentiLico));
                componenta.setKraskiComponentiOborotN(chKraskiIzListVString(kraskiComponentiOborot));
                componenta.setDataPolycheniy(bufData1);
                componenta.setDataPrixodaCvetoprobi(bufData2);
                listOfTree.setTypeList(componenta);
                buferTreenode.setData(listOfTree);
                componenta = null;
            }
            if (groupOfList == 26) {
                listOfTree = (ListOfTree) buferTreenode.getData();
                List<Object> bufListDostavki = new ArrayList<>();
                for (int i = 0; i < dostavka.size(); i++) {
                    dostavka.get(i).setDataOtgryzkiDostavki(dostavkaDate.get(i));
                    bufListDostavki.add(dostavka.get(i));
                }
                listOfTree.setChildrenClass(bufListDostavki);
            }
            if (groupOfList == 14) {
                listOfTree = (ListOfTree) buferTreenode.getData();
                List<Object> bufListOtdelki = new ArrayList<>();
                for (Otdelkacomponenti anOtdelkaComponenti : otdelkaComponenti) {
                    bufListOtdelki.add(anOtdelkaComponenti);
                }
                listOfTree.setChildrenClass(bufListOtdelki);
            }
            if (groupOfList == 21) {
                podizdaniya.setSostavPodizdaniya(perevodComponentListVStr());
            }
            //Замена страницы и показываемого класса
            if (groupOfList == 23) {
                listOfTree = (ListOfTree) buferTreenode.getData();
                List<Object> bufListOperacii = new ArrayList<>();
                for (Operaciisgotovimizdeliem anOtdelkaComponenti : operaciiNadIzdeliem) {
                    bufListOperacii.add(anOtdelkaComponenti);
                }
                listOfTree.setChildrenClass(bufListOperacii);
            }
            buferTreenode = null;
            buferTreenode = (NodeTreeMy) event.getTreeNode();
            listOfTree = (ListOfTree) buferTreenode.getData();
            System.out.println("Группа выбраного листа дерева = " + listOfTree.getNumbClass());
            chooseTreeSwitch(listOfTree);
        }
    }

    //метод установки буферных переменных
    public void chooseTreeSwitch(ListOfTree listOfTree) {
        if (listOfTree.getPageForList() != null) {
            switch (listOfTree.getGroupList()) {
                case 0:
                    idZayavki = (Idzayavki) listOfTree.getTypeList();
                    bufData1 = idZayavki.getDateBegin();
                    bufData2 = idZayavki.getDateEnd();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 11:
                    buferMainClass = listOfTree.getTypeList();
                    componenta = (Componenti) buferMainClass;
                    System.out.println(componenta.getNazvanieComponenti());
                    bufData1 = componenta.getDataPolycheniy();
                    bufData2 = componenta.getDataPrixodaCvetoprobi();
                    kraskiComponentiLico = chKraskiIzStringVList(componenta.getKraskiComponentiLicoN());
                    kraskiComponentiOborot = chKraskiIzStringVList(componenta.getKraskiComponentiOborotN());
                    NodeTreeMy tt = (NodeTreeMy) buferTreenode.getParent().getParent();
                    System.out.println("---------------" + tt);
                    ListOfTree zz = (ListOfTree) tt.getData();
                    System.out.println(componenta.getTipKraski());
                    spisokRecomObor = new spravochnik.FormirovanieRekObor(componenta.getTipKraski()).getSpisok();
                    // Object gg = null;
                    try {
                        Dopizdelie gg = (Dopizdelie) zz.getTypeList();
                        if (gg.getTipIzdeliya() != null) {
                            spisokKomponent = new FormirovanieSpiskaKomponent(gg.getTipIzdeliya()).getSpisok();
                        } else {
                            spisokKomponent = new ArrayList<>();

                        }
                    } catch (ClassCastException e) {
                        Idzayavki gg = (Idzayavki) zz.getTypeList();
                        if (gg.getTipIzdeliya() != null) {
                            spisokKomponent = new FormirovanieSpiskaKomponent(gg.getTipIzdeliya()).getSpisok();
                        } else {
                            spisokKomponent = new ArrayList<>();
                        }
                    }

                    // spisokKomponent = new FormirovanieSpiskaKomponent(gg.getTipIzdeliya()).getSpisok();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 12:
                    //buferMainClass = (Bymaga) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 13:
                    buferMainClass = listOfTree.getTypeList();
                    pantoniLico = new ArrayList<>();
                    pantoniOborot = new ArrayList<>();
                    for (int i = 0; i < listOfTree.getChildrenClass().size(); i++) {
                        pantoniLico.add((Pantoninamashine) listOfTree.getChildrenClass().get(i));
                    }
                    for (int i = 0; i < listOfTree.getChildrenClass2().size(); i++) {
                        pantoniOborot.add((Pantoninamashine) listOfTree.getChildrenClass2().get(i));
                    }
                    if (pantoniLico.size() > 0) {
                        pantonLico = new Pantonespravochnik();
                        pantonLico.setNamePantona(pantoniLico.get(0).getNomerPantona());

                    }
                    if (pantoniOborot.size() > 0) {
                        pantonOborot = new Pantonespravochnik();
                        pantonOborot.setNamePantona(pantoniOborot.get(0).getNomerPantona());
                    }
                    indexPantoniLico = 0;
                    indexPantoniOborot = 0;
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 14:
                    otdelkaComponenti = new ArrayList<>();
                    colOtdelok = 0;
                    for (int i = 0; i < listOfTree.getChildrenClass().size(); i++) {
                        otdelkaComponenti.add((Otdelkacomponenti) listOfTree.getChildrenClass().get(i));
                    }
                    colOtdelok = otdelkaComponenti.size();
                    System.out.println("Количество отделок " + colOtdelok);
                    indexOtdelkiComponenti = 0;
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 15:
                    // buferMainClass = (Lakirovanienamashine) listOfTree.getTypeList();
                    lakLico = new ArrayList<>();
                    lakOborot = new ArrayList<>();
                    for (int i = 0; i < listOfTree.getChildrenClass().size(); i++) {
                        lakLico.add((Lakirovanienamashine) listOfTree.getChildrenClass().get(i));
                    }
                    for (int i = 0; i < listOfTree.getChildrenClass2().size(); i++) {
                        lakOborot.add((Lakirovanienamashine) listOfTree.getChildrenClass2().get(i));
                    }
                    indexLakovLico = 0;
                    indexLakovOborot = 0;
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 16:
                    buferMainClass = (Spyski) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 21:
                    podizdaniya = (Podizdaniya) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    perevodComponentStrVList(podizdaniya.getSostavPodizdaniya());
                    break;
                case 22:
                    buferMainClass = (Broshyrovkapodizdaniya) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 23:
                    operaciiNadIzdeliem = new ArrayList<>();
                    int j = listOfTree.getChildrenClass().size();
                    for (int i = 0; i < j; i++) {
                        operaciiNadIzdeliem.add((Operaciisgotovimizdeliem) listOfTree.getChildrenClass().get(i));
                    }
                    colOperacii = operaciiNadIzdeliem.size();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 24:
                    ypakovka = (Ypakovkagotovogoizdeliya) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 25:
                    ykladka = (Ykladkanapaleti) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 26:
                    dostavka = new ArrayList<>();
                    dostavkaDate = new ArrayList<>();
                    for (int i = 0; i < listOfTree.getChildrenClass().size(); i++) {
                        dostavka.add((Dostavka) listOfTree.getChildrenClass().get(i));
                        dostavkaDate.add(dostavka.get(i).getDataOtgryzkiDostavki());
                    }
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 27:
                    signali = (Dostavkasignalov) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 50:
                    dopIzdelie = (Dopizdelie) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                case 51:
                    componenta = (Componenti) listOfTree.getTypeList();
                    showedPage = listOfTree.getPageForList();
                    groupOfList = listOfTree.getGroupList();
                    break;
                default:
                    System.out.println("В createEntity.chooseTree произошел default");
                    break;
            }
        }

    }

    public void saveDate(SelectEvent event) {
    }

    public void saveDateDostavki(SelectEvent event) {
        risovanieDostavok();
    }

    public void showDate2(SelectEvent event) {
        System.out.println("Дата " + bufData2);
    }


    //Метод определения нужного класса для методов
    public int checkGroups(int numGroup) {
        ListOfTree listOfTree1;
        for (int i = 0; i < buferTreenode.getChildren().size(); i++) {
            listOfTree1 = (ListOfTree) buferTreenode.getChildren().get(i).getData();
            if (listOfTree1.getGroupList() == numGroup) {
                return i;
            }
        }
        return -1;
    }

    public int checkGroups(int numGroup, NodeTreeMy buferNode) {
        ListOfTree listOfTree1;
        for (int i = 0; i < buferNode.getChildren().size(); i++) {
            listOfTree1 = (ListOfTree) buferNode.getChildren().get(i).getData();
            if (listOfTree1.getGroupList() == numGroup) {
                return i;
            }
        }
        return -1;
    }

    //----------------------------------------------------------------------
//--------------------------------------------------------
    //МЕТОДЫ ДЛЯ ПОДЪИЗДАНИЯ
//Изменение названия подъиздания
    public void chNazvaniePodizdaniya() {
        ListOfTree listOfTree;
        listOfTree = (ListOfTree) buferTreenode.getData();
        listOfTree.setNameClass(podizdaniya.getCommentPodizdaniya());
    }

    //Добавление сигналов
    public void addDostavkiSignalov() {

        if (podizdaniya.getSignaliPodizdanie()) {
            new ClassNodeTreeMy(new ListOfTree("Доставка сигналов", new Dostavkasignalov(), "/calculatorPage/podizdaniya/dostavkaSignalov/dostavkaSignalovTM.xhtml", 27, "green"), buferTreenode);
        }
        if (!podizdaniya.getSignaliPodizdanie()) {
            int buf = checkGroups(27);
            if (buf != -1) {
                buferTreenode.getChildren().remove(buf);
            }

        }
    }

    //Изменение названия комментария к изданию

    public void chCommentIdZayavki() {
        ListOfTree listOfTree = (ListOfTree) zayavka.getData();
        listOfTree.setNameClass(idZayavki.getNazvanieIzdaniya() + " " + idZayavki.getCommentIzdanie());
    }


    //Изменение количества подъизданий
    public void chColPodizdanii() {
        int colPodizdanii = idZayavki.getColPodizdanii();
        NodeTreeMy buferGroupPodizdanie = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(3));
        if (colPodizdanii > buferGroupPodizdanie.getChildren().size()) {
            int buf = colPodizdanii - buferGroupPodizdanie.getChildren().size();
            for (int i = 0; i < buf; i++) {
                Podizdaniya bufPodizdanie = new Podizdaniya();
                bufPodizdanie.setCommentPodizdaniya("Часть издания " + (podeizdanieGroup.getChildren().size() + 1));
                bufPodizdanie.setMaketPodizdaniya(false);
                bufPodizdanie.setOperaciiSPodizdaniem(false);
                bufPodizdanie.setSignaliPodizdanie(false);
                bufPodizdanie.setTirajPodizdaniya(0);
                bufPodizdanie.setColYpakovok(1);
                buferGroupPodizdanie.getChildren().add(new ClassNodeTreeMy(new ListOfTree(bufPodizdanie.getCommentPodizdaniya(),
                        bufPodizdanie, "/calculatorPage/podizdaniya/podizdanie.xhtml", 21, "green"), buferGroupPodizdanie));
                addPodizdanieList(buferGroupPodizdanie.getChildren().size() - 1);
            }
        }
        if (colPodizdanii < buferGroupPodizdanie.getChildren().size()) {
            int buf = buferGroupPodizdanie.getChildren().size() - colPodizdanii;
            for (int i = 0; i < buf; i++) {
                buferGroupPodizdanie.getChildren().remove(buferGroupPodizdanie.getChildren().size() - 1);
            }
        }

    }

    //Добавление операций с изделием
    public void addOperaciiSIzdeliem() {
        //Запустили добавление
        int buf = checkGroups(22);
        if (buf != -1) {
            NodeTreeMy bufBroshyrovki = (NodeTreeMy) buferTreenode.getChildren().get(buf);
            if (podizdaniya.getOperaciiSPodizdaniem()) {
                if (bufBroshyrovki.getChildren().size() == 0) {
                    //само добавление
                    Operaciisgotovimizdeliem tt = new Operaciisgotovimizdeliem();
                    tt.setIdOperaciiSgIzdeliem(1);
                    tt.setDavalceskoeOsgi("НЕТ");
                    List<Object> operaciisgotovimizdeliemList = new ArrayList<>();
                    operaciisgotovimizdeliemList.add(tt);
                    bufBroshyrovki.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Операции с изделием", operaciisgotovimizdeliemList, "/calculatorPage/podizdaniya/operaciiSizdeliem/operaciiSizdeliemTM.xhtml", 23, "black"), bufBroshyrovki));
                    NodeTreeMy bufOperacii = (NodeTreeMy) bufBroshyrovki.getChildren().get(0);
                    bufOperacii.getChildren().add(new ClassNodeTreeMy(new ListOfTree("1", "black"), bufOperacii));
                }
            }

            if (!podizdaniya.getOperaciiSPodizdaniem()) {
                if (bufBroshyrovki.getChildren().size() != 0) {
                    //само добавление
                    bufBroshyrovki.getChildren().remove(buf);
                }
            }
        }
    }

    //Метод перевода компонент из строки в ЛИСТ
    public void perevodComponentStrVList(String st) {
        List<String> tt = new ArrayList<>();
        List<String> tt1 = new ArrayList<>();
        NodeTreeMy groupPodizdanie = (NodeTreeMy) buferTreenode.getParent();
        System.out.println("groupPodizdanie " + groupPodizdanie);
        NodeTreeMy izdanie = (NodeTreeMy) groupPodizdanie.getParent();
        System.out.println("izdanie " + izdanie);
        NodeTreeMy groupComponenti = (NodeTreeMy) izdanie.getChildren().get(checkGroups(2, izdanie));
        if (st != null) {
            String[] result = st.split(":");
            Collections.addAll(tt1, result);
        }
        for (int i = 0; i < groupComponenti.getChildren().size(); i++) {
            ListOfTree cc1 = (ListOfTree) groupComponenti.getChildren().get(i).getData();
            Componenti com = (Componenti) cc1.getTypeList();
            tt.add(com.getTipComponenti() + " " + com.getNazvanieComponenti());
        }
        if (tt.containsAll(tt1)) {
            tt.removeAll(tt1);
        } else {
            tt1 = new ArrayList<>();
        }
        componentiListModel = new DualListModel<>(tt, tt1);
    }

    //Метод перевода компонент из Листа в строку
    private String perevodComponentListVStr() {
        String sostav = "";
        if (componentiListModel.getTarget().size() > 0) {
            for (int i = 0; i < componentiListModel.getTarget().size(); i++) {
                sostav = sostav + componentiListModel.getTarget().get(i) + ":";
            }
        }
        return sostav;
    }

    //Метод добавления подъиздания
    public void addPodizdanieList(int count) {
        //добавление брошуровки
        podeizdanieGroup.getChildren().get(count).getChildren().add(new ClassNodeTreeMy(new ListOfTree("Брошюровка", new Broshyrovkapodizdaniya(), "/calculatorPage/podizdaniya/broshyrovka/broshyrovkaTM.xhtml", 22, "green"), podeizdanieGroup.getChildren().get(count)));
        podeizdanieGroup.getChildren().get(count).getChildren().add(new ClassNodeTreeMy(new ListOfTree("Логистика", 30, "black"), podeizdanieGroup.getChildren().get(count)));
        NodeTreeMy bufPodizdanie = (NodeTreeMy) podeizdanieGroup.getChildren().get(count);
        int tt = 0;
        for (int i = 0; i < bufPodizdanie.getChildren().size(); i++) {
            ListOfTree buf = (ListOfTree) bufPodizdanie.getChildren().get(i).getData();
            if (buf.getGroupList() == 30) {
                tt = i;
            }
        }
        NodeTreeMy bufNodeLogistik = (NodeTreeMy) bufPodizdanie.getChildren().get(tt);
        addYpakovka(bufNodeLogistik);
    }

    //Добавление укладок
    public void addYpakovka(NodeTreeMy bufNodeLogistik) {
        Ypakovkagotovogoizdeliya buferYpakovka = new Ypakovkagotovogoizdeliya();
        buferYpakovka.setColYkladok(1);
        bufNodeLogistik.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Упаковка" + (bufNodeLogistik.getChildren().size() + 1), buferYpakovka, "/calculatorPage/podizdaniya/ypakovkaIzdeliya/ypakovkaIzdeliyaTM.xhtml", 24, "green"), bufNodeLogistik));
        NodeTreeMy bufNodeYpakovka = (NodeTreeMy) bufNodeLogistik.getChildren().get(bufNodeLogistik.getChildren().size() - 1);
        addYkladok(bufNodeYpakovka);

    }

    //Добавление упаковок
    public void addYkladok(NodeTreeMy bufNodeYpakovka) {
        Ykladkanapaleti buferYkladka = new Ykladkanapaleti();
        buferYkladka.setKartonayaKrishkaYkladki(false);
        buferYkladka.setStandartnayaYpakovkaYkladka(true);
        buferYkladka.setMaxColNaPalete(0);
        buferYkladka.setKartonieYgolkiYkladki(false);
        buferYkladka.setMaxVesYkladki(0);
        buferYkladka.setMaxVisotaYkladki(0);
        bufNodeYpakovka.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Укладка" + (bufNodeYpakovka.getChildren().size() + 1), buferYkladka, "/calculatorPage/podizdaniya/ykladkaPaleti/ykladkaPaletiTM.xhtml", 25, "green"), bufNodeYpakovka));
        NodeTreeMy bufNodeYkladka = (NodeTreeMy) bufNodeYpakovka.getChildren().get(bufNodeYpakovka.getChildren().size() - 1);
        addDostavka(bufNodeYkladka);
    }

    //Добавление доставок
    public void addDostavka(NodeTreeMy bufNodeYkladka) {
        Dostavka bufDostavka = new Dostavka();
        List<Object> bufList = new ArrayList<>();
        bufDostavka.setDataOtgryzkiDostavki(new Date());
        bufList.add(bufDostavka);
        bufNodeYkladka.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Доставка", bufList, "/calculatorPage/podizdaniya/dostavka/dostavkaTM.xhtml", 26, "green"), bufNodeYkladka));
        NodeTreeMy bufDostavkaList = (NodeTreeMy) bufNodeYkladka.getChildren().get(bufNodeYkladka.getChildren().size() - 1);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        bufDostavkaList.getChildren().add(new ClassNodeTreeMy(new ListOfTree(format.format(bufDostavka.getDataOtgryzkiDostavki()), "black"), bufDostavkaList));
    }

    //Нажатие плюс на странице доставок
    public void addColDostavok() {
        System.out.println("Плюс сработал");
        dostavka.add(new Dostavka());
        dostavkaDate.add(new Date());
        risovanieDostavok();
    }

    public void removeColDostavok() {
        System.out.println("Минус сработал");
        if (dostavka.size() > 1) {
            dostavka.remove(dostavka.size() - 1);
        }
        risovanieDostavok();
    }

    public void risovanieDostavok() {
        buferTreenode.getChildren().removeAll(buferTreenode.getChildren());
        for (Date anDate : dostavkaDate) {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree(format.format(anDate), "black"), buferTreenode));
        }
    }

    //Изменение количества упаковок
    public void chColYpakovok() {
        podizdaniya.getColYpakovok();
        NodeTreeMy bufNodeLogistik = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(30));
        if (podizdaniya.getColYpakovok() > bufNodeLogistik.getChildren().size()) {
            int buf = podizdaniya.getColYpakovok() - bufNodeLogistik.getChildren().size();
            for (int i = 0; i < buf; i++) {
                addYpakovka(bufNodeLogistik);
            }
        }
        if (podizdaniya.getColYpakovok() < bufNodeLogistik.getChildren().size()) {
            int buf = bufNodeLogistik.getChildren().size() - podizdaniya.getColYpakovok();
            for (int i = 0; i < buf; i++) {
                bufNodeLogistik.getChildren().remove(bufNodeLogistik.getChildren().size() - 1);
            }
        }

    }

    public void chColYkladok() {
        ypakovka.getColYkladok();
        // NodeTreeMy bufNodeYpakovki = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(30));
        if (ypakovka.getColYkladok() > buferTreenode.getChildren().size()) {
            int buf = ypakovka.getColYkladok() - buferTreenode.getChildren().size();
            for (int i = 0; i < buf; i++) {
                addYkladok(buferTreenode);
            }
        }
        if (ypakovka.getColYkladok() < buferTreenode.getChildren().size()) {
            System.out.println("Удаляем");
            int buf = buferTreenode.getChildren().size() - ypakovka.getColYkladok();
            for (int i = 0; i < buf; i++) {
                buferTreenode.getChildren().remove(buferTreenode.getChildren().size() - 1);
            }
        }

    }

    //Добавление количества операций
    public void chColOperacii() {
        int i = operaciiNadIzdeliem.size();
        //Увеличиваем количество отделок
        int bufCol;
        bufCol = colOperacii - i;
        if (colOperacii > i) {
            for (int j = 0; j < bufCol; j++) {
                Operaciisgotovimizdeliem operaciYa = new Operaciisgotovimizdeliem();
                operaciYa.setIdOperaciiSgIzdeliem(operaciiNadIzdeliem.size() + 1);
                operaciiNadIzdeliem.add(operaciYa);
            }
        }
        //Уменьшаем количество отделок
        bufCol = i - colOperacii;
        if (colOperacii < i) {
            for (int j = 0; j < bufCol; j++) {
                operaciiNadIzdeliem.remove(operaciiNadIzdeliem.size() - 1);
            }
        }
        chDerevoOperacii();
    }

    //Рисование операций
    //Отображение в дереве отделок
    public void chDerevoOperacii() {
        buferTreenode.getChildren().removeAll(buferTreenode.getChildren());
        for (Operaciisgotovimizdeliem anOtdelkaComponenti : operaciiNadIzdeliem) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree(("" + anOtdelkaComponenti.getIdOperaciiSgIzdeliem()), "black"), buferTreenode));
        }
    }
//-------------------------------------------------------------------------------------------


    //----------------------------------------------------------
    //МЕТОДЫ ОТНОСЯЩИЕСЯ К КОМПОНЕНТЕ И ЕЕ ЭЛЕМЕНТАМ
    //Новый класс
    public Componenti newComponenta() {
        Componenti T = new Componenti();
        List<String> kraskiComponentiLico = new ArrayList<>();
        kraskiComponentiLico.add("C");
        kraskiComponentiLico.add("M");
        kraskiComponentiLico.add("Y");
        kraskiComponentiLico.add("K");
        List<String> kraskiComponentiOborot = new ArrayList<>();
        kraskiComponentiOborot.add("C");
        kraskiComponentiOborot.add("M");
        kraskiComponentiOborot.add("Y");
        kraskiComponentiOborot.add("K");
        T.setTipComponenti("Компонента");
        T.setNazvanieComponenti("1");
        T.setCvetoproba(false);
        T.setDavalcheskoe(false);
        T.setMaketComponenti(false);
        T.setColForm(0);
        T.setDavalcheskoe(false);
        T.setFormat1Componenti("0");
        T.setFormat2Componenti("0");
        T.setFormat3Componenti("0");
        T.setFormat4Componenti("0");
        T.setFormat5Componenti("0");
        T.setFormat6Componenti("0");
        T.setOtdelkaComponenti(false);
        T.setKraskiComponentiLico(4);
        T.setKraskiComponentiOborot(4);
        T.setColPolos(4);
        T.setColForm(0);
        T.setColPantoniLico(0);
        T.setColPantoniOborot(0);
        T.setColLakLico(0);
        T.setColLakOborot(0);
        T.setColPervixPriladok(0);
        T.setTirajComponenti(0);
        T.setKoreshok(1);
        T.setKraskiComponentiLicoN(chKraskiIzListVString(kraskiComponentiLico));
        T.setKraskiComponentiOborotN(chKraskiIzListVString(kraskiComponentiOborot));
        T.setDataPolycheniy(new Date());
        T.setTipKraski("HSWO");
        return T;
    }

    //Изменение количества компонент
    public void chColComponent() {
        NodeTreeMy buferGroupComponent = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(2));
        int colOsnovnixComponent = 0;
        for (int i = 0; i < buferGroupComponent.getChildren().size(); i++) {
            ListOfTree lOT = (ListOfTree) buferGroupComponent.getChildren().get(i).getData();
            if (lOT.getNumbClass() == (-1)) {
                colOsnovnixComponent++;
            }
        }
        if (idZayavki.getColComponent() > colOsnovnixComponent) {
            int buf = idZayavki.getColComponent() - colOsnovnixComponent;
            for (int i = 0; i < buf; i++) {
                defaultComponenti = newComponenta();
                defaultComponenti.setNazvanieComponenti("" + (buferGroupComponent.getChildren().size() + 1));
                buferGroupComponent.getChildren().add(new ClassNodeTreeMy(
                        new ListOfTree((defaultComponenti.getTipComponenti() + " " + defaultComponenti.getNazvanieComponenti()),
                                defaultComponenti, "/calculatorPage/componenti/componenti.xhtml", 11, "green"), buferGroupComponent));
                NodeTreeMy nodeBymaga = (NodeTreeMy) buferGroupComponent.getChildren().get(buferGroupComponent.getChildren().size() - 1);
                nodeBymaga.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Бумага", new Bymaga(), "/calculatorPage/componenti/bymaga/bymagaTM.xhtml", 12, "green"), nodeBymaga));
            }
        }

        if (idZayavki.getColComponent() < colOsnovnixComponent) {
            int buf = colOsnovnixComponent - idZayavki.getColComponent();
            for (int i = 0; i < buf; i++) {
                for (int z = (buferGroupComponent.getChildren().size() - 1); z > 0; z--) {
                    ListOfTree lOT = (ListOfTree) buferGroupComponent.getChildren().get(z).getData();
                    if (lOT.getNumbClass() == (-1)) {
                        buferGroupComponent.getChildren().remove(z);
                        return;
                    }
                }
            }
        }
    }

    //buferGroupComponent.getChildren().remove(buferGroupComponent.getChildren().size() - 1);
    //Метод рисование дополнительных полей для форматов
    public boolean addFormat() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 5);
    }

    public boolean addFormat2() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 7);
    }

    public boolean addFormat3() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 9);
    }

    public boolean addFormat4() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 11);
    }

    public int maxFormat() {
        if (componenta.getTipComponenti().equals("Обложка")) {
            return 12;
        }
        return 1000;
    }

    //Методы показывают нужный номер корешка
    public boolean koreshokRavno1() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 5) && componenta.getKoreshok() == 1;
    }

    public boolean koreshokRavno2() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 5) && componenta.getKoreshok() == 2;
    }

    public boolean koreshokRavno3() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 7) && componenta.getKoreshok() == 3;
    }

    public boolean koreshokRavno4() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 9) && componenta.getKoreshok() == 4;
    }

    public boolean koreshokRavno5() {
        return (componenta.getTipComponenti().equals("Обложка")) && (componenta.getColPolos() > 11) && componenta.getKoreshok() == 5;
    }


    //метод изменения названия компоненты
    public void chNazvanieComponenti() {
        ListOfTree listOfTree;
        listOfTree = (ListOfTree) buferTreenode.getData();
        listOfTree.setNameClass(componenta.getTipComponenti() + " " + componenta.getNazvanieComponenti());
        if ((componenta.getColPolos() > 7) && (componenta.getTipComponenti().equals("Обложка"))) {
            componenta.setKoreshok(1);
            componenta.setColPolos(8);
        }
        //listOfTree.setTypeList(componenta);
    }

    //Методы для красочности перевод их из list в String
    public List<String> chKraskiIzStringVList(String kraski) {
        List<String> kraskiName = new ArrayList<>();
        for (int i = 0; i < kraski.length(); i++) {
            kraskiName.add(kraski.substring(i, i + 1));
        }
        return kraskiName;
    }

    public String chKraskiIzListVString(List<String> stringList) {
        String result = "";
        for (String aStringList : stringList) {
            result = result + aStringList;
        }
        return result;
    }

    //Добавление пантонов
    public void chColKrasok() {
        //Установка количества красок
        int i = componenta.getColPantoniLico() + kraskiComponentiLico.size();
        componenta.setKraskiComponentiLico(i);
        i = componenta.getColPantoniOborot() + kraskiComponentiOborot.size();
        componenta.setKraskiComponentiOborot(i);
        System.out.println("zayavka grypp + " + zayavka.getType());
        //Добавление(удаление) пантона в дерево компоненты
        int buf = checkGroups(13);
        if (((componenta.getColPantoniLico() != 0) || (componenta.getColPantoniOborot() != 0)) && (buf == -1)) {
            //Выполняется добавление пантонов
            List<Object> pantoniLico = new ArrayList<>();
            List<Object> pantoniOborot = new ArrayList<>();
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Pantone", new Pantoninamashine(), pantoniLico, pantoniOborot, "/calculatorPage/componenti/pantoni/pantoniTM.xhtml", 13, "green"), buferTreenode));
            addColPantonov();
            //Формирование листов для пантонов
        } else {
            if (((componenta.getColPantoniLico() == 0) && (componenta.getColPantoniOborot() == 0)) && (buf != -1)) {
                //Выполняется удаление пантонов
                buferTreenode.getChildren().remove(buf);
            }
        }
        addColPantonov();
    }

    //Метод формирования рекомендованого оборудования
    public void chTipPechati() {
        spisokRecomObor = new spravochnik.FormirovanieRekObor(componenta.getTipKraski()).getSpisok();
    }

    //Изменение закладки пантона
    public void onTabChangePantoniLico(TabChangeEvent event) {
        for (int i = 0; i < pantoniLico.size(); i++) {
            if (event.getTab().getTitle().equals(pantoniLico.get(i).getNomerPantona())) {
                pantonLico.setNamePantona(pantoniLico.get(i).getNomerPantona());

                indexPantoniLico = i;
            }
        }
    }

    public void onTabChangePantoniOborot(TabChangeEvent event) {
        for (int i = 0; i < pantoniOborot.size(); i++) {
            if (event.getTab().getTitle().equals(pantoniOborot.get(i).getNomerPantona())) {
                pantonOborot.setNamePantona(pantoniOborot.get(i).getNomerPantona());
                indexPantoniOborot = i;
            }
        }
    }

    public void setPantoneLico(SelectEvent event) {
        pantoniLico.get(indexPantoniLico).setNomerPantona(pantonLico.getNamePantona());
        System.out.println("pantoniLico = " + pantonLico.getColorPantone());
        risovanieSpiskaPantonov();
    }

    public void setPantoneOborot(SelectEvent event) {
        pantoniOborot.get(indexPantoniOborot).setNomerPantona(pantonOborot.getNamePantona());
        risovanieSpiskaPantonov();
    }


    public void risovanieSpiskaPantonov() {
        buferTreenode.getChildren().removeAll(buferTreenode.getChildren());
        for (Pantoninamashine aPantoniLico : pantoniLico) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree((aPantoniLico.getLicoOroborotPantoni() + " " + aPantoniLico.getNomerPantona()), "black"), buferTreenode));
        }
        for (Pantoninamashine aPantoniOborot : pantoniOborot) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree((aPantoniOborot.getLicoOroborotPantoni() + " " + aPantoniOborot.getNomerPantona()), "black"), buferTreenode));
        }
    }

    //Добавление или уменьшение колличества пантонов
    public void addColPantonov() {
        int buf = checkGroups(13);
        if (buf != -1) {
            System.out.println("NodeTreeMy bufNodeTreeMy + " + zayavka.getType());
            NodeTreeMy bufNodeTreeMy = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(13));
            ListOfTree bufListOfTree = (ListOfTree) bufNodeTreeMy.getData();

            if (bufListOfTree.getChildrenClass().size() < componenta.getColPantoniLico()) {
                int g = componenta.getColPantoniLico() - bufListOfTree.getChildrenClass().size();
                for (int j = 0; j < g; j++) {
                    Pantoninamashine bufPanton = new Pantoninamashine();
                    bufPanton.setLicoOroborotPantoni("Лицо");
                    bufPanton.setProcentZapechatkiPantona(44);
                    bufPanton.setPostavshikPantone("Укажите");
                    bufPanton.setNomerPantona("" + (bufListOfTree.getChildrenClass().size() + 1));
                    bufListOfTree.getChildrenClass().add(bufPanton);
                    bufNodeTreeMy.getChildren().add(new ClassNodeTreeMy(new ListOfTree((bufPanton.getLicoOroborotPantoni() + " " + bufPanton.getNomerPantona()), "black"), bufNodeTreeMy));
                }
            }
            if (bufListOfTree.getChildrenClass().size() > componenta.getColPantoniLico()) {
                int g = bufListOfTree.getChildrenClass().size() - componenta.getColPantoniLico();
                for (int j = 0; j < g; j++) {
                    bufListOfTree.getChildrenClass().remove(bufListOfTree.getChildrenClass().size() - j - 1);
                    bufNodeTreeMy.getChildren().remove(bufListOfTree.getChildrenClass().size());
                }
            }
            //Оборот
            if (bufListOfTree.getChildrenClass2().size() < componenta.getColPantoniOborot()) {
                int g = componenta.getColPantoniOborot() - bufListOfTree.getChildrenClass2().size();
                for (int j = 0; j < g; j++) {
                    Pantoninamashine bufPanton = new Pantoninamashine();
                    bufPanton.setLicoOroborotPantoni("Оборот");
                    bufPanton.setPostavshikPantone("Укажите");
                    bufPanton.setProcentZapechatkiPantona(44);
                    bufPanton.setNomerPantona("" + (bufListOfTree.getChildrenClass2().size() + 1));

                    bufListOfTree.getChildrenClass2().add(bufPanton);
                    bufNodeTreeMy.getChildren().add(new ClassNodeTreeMy(new ListOfTree((bufPanton.getLicoOroborotPantoni() + " " + bufPanton.getNomerPantona()), "black"), bufNodeTreeMy));
                }
            }
            if (bufListOfTree.getChildrenClass2().size() > componenta.getColPantoniOborot()) {
                int g = bufListOfTree.getChildrenClass2().size() - componenta.getColPantoniOborot();
                for (int j = 0; j < g; j++) {
                    bufListOfTree.getChildrenClass2().remove(bufListOfTree.getChildrenClass2().size() - j - 1);
                    bufNodeTreeMy.getChildren().remove(bufListOfTree.getChildrenClass2().size());
                }
            }
        }
    }

    //Изменение положения ползунка давальческое
    public void chDavalcheskoe() {
        if (componenta.getDavalcheskoe()) {
            int buf = checkGroups(12);
            if (buf != -1) {
                buferTreenode.getChildren().remove(buf);
            }
            buf = checkGroups(13);
            if (buf != -1) {
                buferTreenode.getChildren().remove(buf);
            }
            buf = checkGroups(15);
            if (buf != -1) {
                buferTreenode.getChildren().remove(buf);
            }
        } else {
            chColKrasok();
            chColLakov();
            new ClassNodeTreeMy(new ListOfTree("Бумага", new Bymaga(), "/calculatorPage/componenti/bymaga/bymagaTM.xhtml", 12, "black"), buferTreenode);

        }
    }

    //добавление лаков
    public void chColLakov() {
        int buf = checkGroups(15);
        if (((componenta.getColLakLico() != 0) || (componenta.getColLakOborot() != 0)) && (buf == -1)) {
            //Выполняется добавление пантонов
            List<Object> lakiLico = new ArrayList<>();
            List<Object> lakiOborot = new ArrayList<>();
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Лаки", new Lakirovanienamashine(), lakiLico, lakiOborot, "/calculatorPage/componenti/lakirovanie/lakirovanieTM.xhtml", 15, "green"), buferTreenode));

        } else {
            if (((componenta.getColLakLico() == 0) && (componenta.getColLakOborot() == 0)) && (buf != -1)) {
                //Выполняется удаление пантонов
                buferTreenode.getChildren().remove(buf);
            }
        }
        managerLakov();
    }

    //Изменение количества лаков
    public void managerLakov() {
        int buf = checkGroups(15);
        if (buf != -1) {
            NodeTreeMy bufNodeTreeMy = (NodeTreeMy) buferTreenode.getChildren().get(buf);
            ListOfTree bufListOfTree = (ListOfTree) bufNodeTreeMy.getData();
            if (bufListOfTree.getChildrenClass().size() < componenta.getColLakLico()) {
                int g = componenta.getColLakLico() - bufListOfTree.getChildrenClass().size();
                for (int j = 0; j < g; j++) {
                    Lakirovanienamashine bufLaki = new Lakirovanienamashine();
                    bufLaki.setLicoORoborotLak("Лицо");
                    bufLaki.setTipLakirovaniya("Сплошной");
                    bufLaki.setTipLaka("ВД");
                    bufLaki.setVidLaka("Gloss");
                    bufLaki.setPostavchikLaka("Укажите");
                    bufListOfTree.getChildrenClass().add(bufLaki);
                    bufNodeTreeMy.getChildren().add(new ClassNodeTreeMy(new ListOfTree((bufLaki.getLicoORoborotLak() + " " + bufLaki.getTipLaka() + " " + bufLaki.getVidLaka()), "black"), bufNodeTreeMy));
                }
            }
            if (bufListOfTree.getChildrenClass().size() > componenta.getColLakLico()) {
                int g = bufListOfTree.getChildrenClass().size() - componenta.getColLakLico();
                for (int j = 0; j < g; j++) {
                    bufListOfTree.getChildrenClass().remove(bufListOfTree.getChildrenClass().size() - j - 1);
                    bufNodeTreeMy.getChildren().remove(bufListOfTree.getChildrenClass().size());
                }
            }
            //Оборот
            if (bufListOfTree.getChildrenClass2().size() < componenta.getColLakOborot()) {
                int g = componenta.getColLakOborot() - bufListOfTree.getChildrenClass2().size();
                for (int j = 0; j < g; j++) {
                    Lakirovanienamashine bufLaki = new Lakirovanienamashine();
                    bufLaki.setLicoORoborotLak("Оборот");
                    bufLaki.setTipLakirovaniya("Сплошной");
                    bufLaki.setTipLaka("ВД");
                    bufLaki.setVidLaka("Gloss");
                    bufLaki.setPostavchikLaka("Укажите");
                    bufListOfTree.getChildrenClass2().add(bufLaki);
                    bufNodeTreeMy.getChildren().add(new ClassNodeTreeMy(new ListOfTree((bufLaki.getLicoORoborotLak() + " " + bufLaki.getTipLaka() + " " + bufLaki.getVidLaka()), "black"), bufNodeTreeMy));
                }
            }
            if (bufListOfTree.getChildrenClass2().size() > componenta.getColLakOborot()) {
                int g = bufListOfTree.getChildrenClass2().size() - componenta.getColLakOborot();
                for (int j = 0; j < g; j++) {
                    bufListOfTree.getChildrenClass2().remove(bufListOfTree.getChildrenClass2().size() - j - 1);
                    bufNodeTreeMy.getChildren().remove(bufListOfTree.getChildrenClass2().size());
                }
            }
        }
    }

    //Изменение типа лаков
    public void chTipLakaLico(int i) {
        indexLakovLico = i;
        risovanieSpiskaLako();
    }

    public void chTipLakaOborot(int i) {
        indexLakovOborot = i;
        risovanieSpiskaLako();
    }

    public void risovanieSpiskaLako() {
        buferTreenode.getChildren().removeAll(buferTreenode.getChildren());
        for (Lakirovanienamashine aLakLico : lakLico) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree((aLakLico.getLicoORoborotLak() + " " + aLakLico.getTipLaka() + " " + aLakLico.getVidLaka()), "black"), buferTreenode));
        }
        for (Lakirovanienamashine aLakOborot : lakOborot) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree((aLakOborot.getLicoORoborotLak() + " " + aLakOborot.getTipLaka() + " " + aLakOborot.getVidLaka()), "black"), buferTreenode));
        }
    }

    //Добавление отделки компонентов в компоненты
    public void addOtdelkiComponenti() {
        if (componenta.getOtdelkaComponenti()) {
            List<Object> bufOtdelkaList = new ArrayList<>();
            Otdelkacomponenti otdelkacomponenti = new Otdelkacomponenti();
            otdelkacomponenti.setIdOperaciiOtdelki(0);
            otdelkacomponenti.setNaimenovanieOtdelki("Отделка");
            bufOtdelkaList.add(otdelkacomponenti);
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Отделки", new Otdelkacomponenti(), bufOtdelkaList, "/calculatorPage/componenti/otdelka/otdelkaTM.xhtml", 14, "green"), buferTreenode));
            NodeTreeMy nodeTreeMy = (NodeTreeMy) buferTreenode.getChildren().get(checkGroups(14));
            nodeTreeMy.getChildren().add(new ClassNodeTreeMy(new ListOfTree("Отделка", "black"), nodeTreeMy));
        } else {
            int buf = checkGroups(14);
            if (buf != -1) {
                buferTreenode.getChildren().remove(buf);
            }
        }

    }

    //Изменение количества отделок на странице отделок
    public void chColOtdeloc() {
        int i = otdelkaComponenti.size();
        //Увеличиваем количество отделок
        int bufCol;
        bufCol = colOtdelok - i;
        if (colOtdelok > i) {
            for (int j = 0; j < bufCol; j++) {
                Otdelkacomponenti otdelkacomponenti = new Otdelkacomponenti();
                otdelkacomponenti.setIdOperaciiOtdelki(0);
                otdelkacomponenti.setNaimenovanieOtdelki("Отделка");
                otdelkaComponenti.add(otdelkacomponenti);
            }
        }
        //Уменьшаем количество отделок
        bufCol = i - colOtdelok;
        if (colOtdelok < i) {
            for (int j = 0; j < bufCol; j++) {
                otdelkaComponenti.remove(otdelkaComponenti.size() - 1);
            }
        }
        chDerevoOtdelki();
    }

    public void chNazvanieOtdelki(int i) {
        indexOtdelkiComponenti = i;
        chDerevoOtdelki();
    }

    //Отображение в дереве отделок
    public void chDerevoOtdelki() {
        buferTreenode.getChildren().removeAll(buferTreenode.getChildren());
        for (Otdelkacomponenti anOtdelkaComponenti : otdelkaComponenti) {
            buferTreenode.getChildren().add(new ClassNodeTreeMy(new ListOfTree((anOtdelkaComponenti.getNaimenovanieOtdelki()), "black"), buferTreenode));
        }
    }

    //Поиск пантонов
    public List<Pantonespravochnik> completePantoniLico(String query) {
        List<Pantonespravochnik> allPantoni = spravochnikPantonov;
        List<Pantonespravochnik> filteredThemes = new ArrayList<>();
        for (Pantonespravochnik skin : allPantoni) {
            if ((skin.getNamePantona().toLowerCase().startsWith(query)) || (skin.getNamePantona().startsWith(query))) {
                filteredThemes.add(skin);
            }
        }
        return filteredThemes;
    }

    public List<Pantonespravochnik> completePantoniOborot(String query) {
        List<Pantonespravochnik> allPantoni = spravochnikPantonov;
        List<Pantonespravochnik> filteredThemes = new ArrayList<>();
        for (Pantonespravochnik skin : allPantoni) {
            if ((skin.getNamePantona().toLowerCase().startsWith(query)) || (skin.getNamePantona().startsWith(query))) {
                filteredThemes.add(skin);
            }
        }
        return filteredThemes;
    }

    //---------------------------------------------------------------------
    //КОНСТРУКТОРЫ
    public NodeTreeMy getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(NodeTreeMy treeNode) {
        this.treeNode = treeNode;
    }

    public NodeTreeMy getZayavka() {
        return zayavka;
    }

    public void setZayavka(NodeTreeMy zayavka) {
        this.zayavka = zayavka;
    }

    public Object getBuferMainClass() {
        return buferMainClass;
    }

    public void setBuferMainClass(Object buferMainClass) {
        this.buferMainClass = buferMainClass;
    }

    public String getShowedPage() {
        return showedPage;
    }

    public void setShowedPage(String showedPage) {
        this.showedPage = showedPage;
    }

    public Idzayavki getIdZayavki() {
        return idZayavki;
    }

    public void setIdZayavki(Idzayavki idZayavki) {
        this.idZayavki = idZayavki;
    }

    public List<String> getKraskiComponentiOborot() {
        return kraskiComponentiOborot;
    }

    public void setKraskiComponentiOborot(List<String> kraskiComponentiOborot) {
        this.kraskiComponentiOborot = kraskiComponentiOborot;
    }

    public List<String> getKraskiComponentiLico() {
        return kraskiComponentiLico;
    }

    public void setKraskiComponentiLico(List<String> kraskiComponentiLico) {
        this.kraskiComponentiLico = kraskiComponentiLico;
    }

    public Componenti getComponenta() {
        return componenta;
    }

    public void setComponenta(Componenti componenta) {
        this.componenta = componenta;
    }

    public DualListModel<String> getComponentiListModel() {
        return componentiListModel;
    }

    public void setComponentiListModel(DualListModel<String> componentiListModel) {
        this.componentiListModel = componentiListModel;
    }

    public List<Pantoninamashine> getPantoniOborot() {
        return pantoniOborot;
    }

    public void setPantoniOborot(List<Pantoninamashine> pantoniOborot) {
        this.pantoniOborot = pantoniOborot;
    }

    public List<Pantoninamashine> getPantoniLico() {
        return pantoniLico;
    }

    public void setPantoniLico(List<Pantoninamashine> pantoniLico) {
        this.pantoniLico = pantoniLico;
    }

    public int getIndexPantoniOborot() {
        return indexPantoniOborot;
    }

    public void setIndexPantoniOborot(int indexPantoniOborot) {
        this.indexPantoniOborot = indexPantoniOborot;
    }

    public int getIndexPantoniLico() {
        return indexPantoniLico;
    }

    public void setIndexPantoniLico(int indexPantoniLico) {
        this.indexPantoniLico = indexPantoniLico;
    }

    public List<Lakirovanienamashine> getLakOborot() {
        return lakOborot;
    }

    public void setLakOborot(List<Lakirovanienamashine> lakOborot) {
        this.lakOborot = lakOborot;
    }

    public List<Lakirovanienamashine> getLakLico() {
        return lakLico;
    }

    public void setLakLico(List<Lakirovanienamashine> lakLico) {
        this.lakLico = lakLico;
    }

    public int getIndexLakovOborot() {
        return indexLakovOborot;
    }

    public void setIndexLakovOborot(int indexLakovOborot) {
        this.indexLakovOborot = indexLakovOborot;
    }

    public int getIndexLakovLico() {
        return indexLakovLico;
    }

    public void setIndexLakovLico(int indexLakovLico) {
        this.indexLakovLico = indexLakovLico;
    }

    public List<Otdelkacomponenti> getOtdelkaComponenti() {
        return otdelkaComponenti;
    }

    public void setOtdelkaComponenti(List<Otdelkacomponenti> otdelkaComponenti) {
        this.otdelkaComponenti = otdelkaComponenti;
    }

    public int getIndexOtdelkiComponenti() {
        return indexOtdelkiComponenti;
    }

    public void setIndexOtdelkiComponenti(int indexOtdelkiComponenti) {
        this.indexOtdelkiComponenti = indexOtdelkiComponenti;
    }

    public List<TestSpisokOtdelok> getTestSpisokOtdelok() {
        return testSpisokOtdelok;
    }

    public void setTestSpisokOtdelok(List<TestSpisokOtdelok> testSpisokOtdelok) {
        this.testSpisokOtdelok = testSpisokOtdelok;
    }

    public int getColOtdelok() {
        return colOtdelok;
    }

    public void setColOtdelok(int colOtdelok) {
        this.colOtdelok = colOtdelok;
    }

    public List<Pantonespravochnik> getSpravochnikPantonov() {
        return spravochnikPantonov;
    }

    public void setSpravochnikPantonov(List<Pantonespravochnik> spravochnikPantonov) {
        this.spravochnikPantonov = spravochnikPantonov;
    }

    public List<String> getSpisokPPKDav() {
        return spisokPPKDav;
    }

    public void setSpisokPPKDav(List<String> spisokPPKDav) {
        this.spisokPPKDav = spisokPPKDav;
    }

    public Date getBufData1() {
        return bufData1;
    }

    public void setBufData1(Date bufData1) {
        this.bufData1 = bufData1;
    }

    public Date getBufData2() {
        return bufData2;
    }

    public void setBufData2(Date bufData2) {
        this.bufData2 = bufData2;
    }

    public Podizdaniya getPodizdaniya() {
        return podizdaniya;
    }

    public void setPodizdaniya(Podizdaniya podizdaniya) {
        this.podizdaniya = podizdaniya;
    }

    public List<Operaciisgotovimizdeliem> getOperaciiNadIzdeliem() {
        return operaciiNadIzdeliem;
    }

    public void setOperaciiNadIzdeliem(List<Operaciisgotovimizdeliem> operaciiNadIzdeliem) {
        this.operaciiNadIzdeliem = operaciiNadIzdeliem;
    }

    public int getColOperacii() {
        return colOperacii;
    }

    public void setColOperacii(int colOperacii) {
        this.colOperacii = colOperacii;
    }

    public int getIndexOperacii() {
        return indexOperacii;
    }

    public void setIndexOperacii(int indexOperacii) {
        this.indexOperacii = indexOperacii;
    }

    public Pantonespravochnik getPantonLico() {
        return pantonLico;
    }

    public void setPantonLico(Pantonespravochnik pantonLico) {
        this.pantonLico = pantonLico;
    }

    public Pantonespravochnik getPantonOborot() {
        return pantonOborot;
    }

    public void setPantonOborot(Pantonespravochnik pantonOborot) {
        this.pantonOborot = pantonOborot;
    }

    public Ypakovkagotovogoizdeliya getYpakovka() {
        return ypakovka;
    }

    public void setYpakovka(Ypakovkagotovogoizdeliya ypakovka) {
        this.ypakovka = ypakovka;
    }

    public Ykladkanapaleti getYkladka() {
        return ykladka;
    }

    public void setYkladka(Ykladkanapaleti ykladka) {
        this.ykladka = ykladka;
    }

    public List<Dostavka> getDostavka() {
        return dostavka;
    }

    public void setDostavka(List<Dostavka> dostavka) {
        this.dostavka = dostavka;
    }

    public Dostavkasignalov getSignali() {
        return signali;
    }

    public void setSignali(Dostavkasignalov signali) {
        this.signali = signali;
    }

    public List<Date> getDostavkaDate() {
        return dostavkaDate;
    }

    public void setDostavkaDate(List<Date> dostavkaDate) {
        this.dostavkaDate = dostavkaDate;
    }

    public Dopizdelie getDopIzdelie() {
        return dopIzdelie;
    }

    public void setDopIzdelie(Dopizdelie dopIzdelie) {
        this.dopIzdelie = dopIzdelie;
    }

    public String getFormatBykvi() {
        return formatBykvi;
    }

    public void setFormatBykvi(String formatBykvi) {
        this.formatBykvi = formatBykvi;
    }

    public ReestrIzdanii getIzdanieContrAgent() {
        return izdanieContrAgent;
    }

    public void setIzdanieContrAgent(ReestrIzdanii izdanieContrAgent) {
        this.izdanieContrAgent = izdanieContrAgent;
    }

    public ReestrIzdanii getIzdanie() {
        return izdanie;
    }

    public void setIzdanie(ReestrIzdanii izdanie) {
        this.izdanie = izdanie;
    }

    public List<ReestrIzdanii> getSpisokIzdanii() {
        return spisokIzdanii;
    }

    public void setSpisokIzdanii(List<ReestrIzdanii> spisokIzdanii) {
        this.spisokIzdanii = spisokIzdanii;
    }

    public List<IdKontragentov> getZakazchikiList() {
        return zakazchikiList;
    }

    public void setZakazchikiList(List<IdKontragentov> zakazchikiList) {
        this.zakazchikiList = zakazchikiList;
    }

    public List<SpisokComponent> getSpisokKomponent() {
        return spisokKomponent;
    }

    public void setSpisokKomponent(List<SpisokComponent> spisokKomponent) {
        this.spisokKomponent = spisokKomponent;
    }

    public boolean isFilterKontragentov() {
        return filterKontragentov;
    }

    public void setFilterKontragentov(boolean filterKontragentov) {
        this.filterKontragentov = filterKontragentov;
    }

    public boolean isFilterIzdanii() {
        return filterIzdanii;
    }

    public void setFilterIzdanii(boolean filterIzdanii) {
        this.filterIzdanii = filterIzdanii;
    }

    public List<String> getSpisokRecomObor() {
        return spisokRecomObor;
    }

    public void setSpisokRecomObor(List<String> spisokRecomObor) {
        this.spisokRecomObor = spisokRecomObor;
    }

    public NodeTreeMy getBuferTreenode() {
        return buferTreenode;
    }

    public void setBuferTreenode(NodeTreeMy buferTreenode) {
        this.buferTreenode = buferTreenode;
    }

    public boolean isShowLeftMenu() {
        return showLeftMenu;
    }

    public void setShowLeftMenu(boolean showLeftMenu) {
        this.showLeftMenu = showLeftMenu;
    }

    //***************************************************
    public void createTree() {
        showLeftMenu = true;
    }

    public boolean isShowTiraj() {
        showTiraj = 1 < buferTreenode.getParent().getChildren().size();
        return showTiraj;
    }

    public void setShowTiraj(boolean showTiraj) {
        this.showTiraj = showTiraj;
    }
    //----------------------------------------------------------
// конец класса
}

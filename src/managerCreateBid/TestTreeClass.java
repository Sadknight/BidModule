package managerCreateBid;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DMalenkov on 13.10.2014.
 */
public class TestTreeClass implements Serializable {
    private boolean shPodizda = false;
    private boolean shComponenti = false;
    private TreeNode treeNode = new DefaultTreeNode("Вокруг света", null);
    private TreeNode treeNodePodizd = new DefaultTreeNode("Вокруг света", null);
    private int i = 0;
    private List<TreeNode> treeComponent = new ArrayList<>();

    @PostConstruct
    public void adddefTreeNode() {
        TreeNode tt = new DefaultTreeNode("Обложка", treeNode);
        treeNode.getChildren().add(tt);
        TreeNode tt011 = new DefaultTreeNode("Бумага", treeNode);
        tt.getChildren().add(tt011);
        TreeNode tt02 = new DefaultTreeNode("лак(1+0)", treeNode);
        tt.getChildren().add(tt02);
        TreeNode tt021 = new DefaultTreeNode("Арома", treeNode);
        tt02.getChildren().add(tt021);
        TreeNode tt03 = new DefaultTreeNode("Красочность(4+3)(1+1)", treeNode);
        tt.getChildren().add(tt03);
        TreeNode tt031 = new DefaultTreeNode("P100", treeNode);
        tt03.getChildren().add(tt031);
        TreeNode tt032 = new DefaultTreeNode("P99", treeNode);
        tt03.getChildren().add(tt032);
        TreeNode tt041 = new DefaultTreeNode("Отделка", treeNode);
        tt.getChildren().add(tt041);
        TreeNode tt0411 = new DefaultTreeNode("Лакирование Colibri", treeNode);
        tt041.getChildren().add(tt0411);
        TreeNode tt1 = new DefaultTreeNode("Блок", treeNode);
        treeNode.getChildren().add(tt1);
        TreeNode tt111 = new DefaultTreeNode("Бумага", treeNode);
        tt1.getChildren().add(tt111);
        //-------------------------------
        System.out.println(treeNodePodizd.getData().toString());
        TreeNode ttP0 = new DefaultTreeNode("Запад", treeNodePodizd);
        treeNodePodizd.getChildren().add(ttP0);
        TreeNode ttP1 = new DefaultTreeNode("Восток", treeNodePodizd);
        treeNodePodizd.getChildren().add(ttP1);
        TreeNode ttP01 = new DefaultTreeNode("КБС", treeNodePodizd);
        ttP0.getChildren().add(ttP01);
        TreeNode ttP12 = new DefaultTreeNode("КБС", treeNodePodizd);
        ttP1.getChildren().add(ttP12);
        TreeNode ttP011 = new DefaultTreeNode("1 Операция", treeNodePodizd);
        ttP01.getChildren().add(ttP011);
        TreeNode ttP0111 = new DefaultTreeNode("Упаковка 1", treeNodePodizd);
        ttP011.getChildren().add(ttP0111);
        TreeNode ttP0112 = new DefaultTreeNode("Упаковка 2", treeNodePodizd);
        ttP011.getChildren().add(ttP0112);
        TreeNode ttP01111 = new DefaultTreeNode("Укладка 1", treeNodePodizd);
        ttP0111.getChildren().add(ttP01111);
        TreeNode ttP011111 = new DefaultTreeNode("Доставка 1", treeNodePodizd);
        ttP01111.getChildren().add(ttP011111);
        TreeNode ttP011112 = new DefaultTreeNode("Доставка 2", treeNodePodizd);
        ttP01111.getChildren().add(ttP011112);
        //+++++++++++++++++++++
        TreeNode pp21 = new DefaultTreeNode("2 Операции", treeNodePodizd);
        ttP12.getChildren().add(pp21);

        TreeNode pp211 = new DefaultTreeNode("Упаковка 1", treeNodePodizd);
        //pp21.getChildren().add(pp211);

        TreeNode pp2111 = new DefaultTreeNode("Укладка 1", treeNodePodizd);
        // pp211.getChildren().add(pp2111);

        TreeNode pp21111 = new DefaultTreeNode("Доставка 1", treeNodePodizd);
        //pp2111.getChildren().add(pp21111);

        TreeNode pp21112 = new DefaultTreeNode("Доставка 2", treeNodePodizd);
        //pp2111.getChildren().add(pp21112);
    }

    public void addTreeNode() {

        System.out.println("Элементы №" + this.i);
        String st = new String("Элемент" + this.i);
        System.out.println("st = " + st);
        treeComponent.add(new DefaultTreeNode("Элемент" + this.i, treeNode));
        System.out.println("Создали элемент дерева");
//
        treeNode.getChildren().add(i, treeComponent.get(this.i));
        System.out.println("Добавили в дерево элемент");
        System.out.println(treeNode.getChildren().get(i).getData().toString());
        this.i++;
    }

    public void chShPodizdanie() {
        System.out.println("СРАБОТАЛО chShPodizdanie");
        shComponenti = false;
        shPodizda = true;
    }

    public void chShComponenti() {
        System.out.println("СРАБОТАЛО chShComponenti");
        shComponenti = true;
        shPodizda = false;
    }

    public void chooseTree(NodeSelectEvent event) {
        System.out.println("СРАБОТАЛО");
        System.out.println(event.getTreeNode().toString());
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public TreeNode getTreeNodePodizd() {
        return treeNodePodizd;
    }

    public boolean isShPodizda() {
        return shPodizda;
    }

    public void setShPodizda(boolean shPodizda) {
        this.shPodizda = shPodizda;
    }

    public boolean isShComponenti() {
        return shComponenti;
    }

    public void setShComponenti(boolean shComponenti) {
        this.shComponenti = shComponenti;
    }
}

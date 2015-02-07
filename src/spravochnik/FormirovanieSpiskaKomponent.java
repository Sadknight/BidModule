package spravochnik;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DMalenkov on 01.12.2014.
 */
public class FormirovanieSpiskaKomponent {
    private List<SpisokComponent> spisok;

    public FormirovanieSpiskaKomponent(String group1) {
        int group = -1;
        if (group1.equals("Журнальное издание КБС")) {
            group = 1;
        }
        if (group1.equals("Журнальное издание ВШРА")) {
            group = 2;
        }
        if (group1.equals("Издания с проклейкой корешка")) {
            group = 3;
        }
        if (group1.equals("Газетное издание со скреплением")) {
            group = 4;
        }
        if (group1.equals("Газетное издание без скрепления")) {
            group = 5;
        }
        if (group1.equals("Листовое издание без фальцовки")) {
            group = 6;
        }
        if (group1.equals("Листовое издание с фальцовкой")) {
            group = 7;
        }
        if (group1.equals("Ролевый полуфабрикат")) {
            group = 8;
        }
        if (group1.equals("Книжное издание")) {
            group = 9;
        }
        if (group1.equals("Календарь")) {
            group = 10;
        }
        spisok = new ArrayList<>();
        spisok.add(new SpisokComponent("Компонента", 0));

        switch (group) {

            case 1:

                spisok.add(new SpisokComponent("Обложка", 1));
                spisok.add(new SpisokComponent("Супер обложка", 2));
                spisok.add(new SpisokComponent("Блок", 3));
                spisok.add(new SpisokComponent("Блок перевертыш", 4));
                spisok.add(new SpisokComponent("Вклейка", 5));
                break;
            case 2:

                spisok.add(new SpisokComponent("Обложка", 1));
                spisok.add(new SpisokComponent("Супер обложка", 2));
                spisok.add(new SpisokComponent("Блок", 3));
                spisok.add(new SpisokComponent("Блок перевертыш", 4));
                spisok.add(new SpisokComponent("Вшивка", 5));
                break;
            case 3:

                spisok.add(new SpisokComponent("Блок", 1));
                break;
            case 4:

                spisok.add(new SpisokComponent("Обложка", 1));
                spisok.add(new SpisokComponent("Супер обложка", 2));
                spisok.add(new SpisokComponent("Блок", 3));
                spisok.add(new SpisokComponent("Блок перевертыш", 4));
                spisok.add(new SpisokComponent("Вшивка", 5));
                break;
            case 5:

                spisok.add(new SpisokComponent("Блок", 1));
                break;
            case 6:

                spisok.add(new SpisokComponent("Листовка", 1));
                spisok.add(new SpisokComponent("Афиша", 2));
                spisok.add(new SpisokComponent("Плакат", 3));
                spisok.add(new SpisokComponent("Постер", 4));
                spisok.add(new SpisokComponent("Купон", 5));
                spisok.add(new SpisokComponent("Визитка", 5));
                break;
            case 7:

                spisok.add(new SpisokComponent("Плакат", 1));
                spisok.add(new SpisokComponent("Постер", 2));
                spisok.add(new SpisokComponent("Купон", 3));
                spisok.add(new SpisokComponent("Буклет", 4));
                spisok.add(new SpisokComponent("Карта", 5));
                break;
            case 8:

                spisok.add(new SpisokComponent("Тетрадь КБС", 1));
                spisok.add(new SpisokComponent("Тетрадь ВШРА", 2));
                break;
            case 9:

                spisok.add(new SpisokComponent("Обложка", 1));
                spisok.add(new SpisokComponent("Супер обложка", 2));
                spisok.add(new SpisokComponent("Блок", 3));
                spisok.add(new SpisokComponent("Фарзац", 4));
                spisok.add(new SpisokComponent("Нахзац", 5));

                break;
            case 10:

                spisok.add(new SpisokComponent("Обложка", 1));
                spisok.add(new SpisokComponent("Блок", 2));
                spisok.add(new SpisokComponent("Подложка", 3));
                spisok.add(new SpisokComponent("Постер", 3));
                break;

            default:
                System.out.println("Неизвестная группа");
                break;
        }
        spisok.add(new SpisokComponent("Давальческое изделие", 11));
        spisok.add(new SpisokComponent("Промообразец", 21));
    }


    public List<SpisokComponent> getSpisok() {
        return spisok;
    }
}

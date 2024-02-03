package ru.kravchenko.java.basic.homeworks.homework4;

public class Box {
    private int boxLength;
    private int boxWidth;
    private int boxHeight;
    private String boxColor;
    private boolean boxOpen;

    private String boxItem;

    public void setBoxColor(String color) {
        this.boxColor = color;
        System.out.println("Перекрасили коробку в " + this.boxColor + " цвет");
    }

    public Box(int boxLength, int boxWidth, int boxHeight, String boxColor) {
        this.boxLength = boxLength;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        this.boxColor = boxColor;
    }

    public void openBox() {
        if (this.boxOpen) {
            System.out.println("Коробка уже открыта!");
        } else {
            this.boxOpen = true;
            System.out.println("Коробка открыта");
        }
    }

    public void closeBox() {
        if (this.boxOpen) {
            this.boxOpen = false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже закрыта!");
        }
    }

    public void putItemInBox(String item) {
        if (this.boxOpen) {
            if (this.boxItem == null) {
                this.boxItem = item;
                System.out.println("Предмет: " + item + " положен в коробку");
            } else {
                System.out.println("В коробке уже лежит предмет: " + this.boxItem);
            }
        } else {
            System.out.println("Коробка закрыта, предмет в нее не положить... =(");
        }
    }

    public void throwItemFromBox() {
        if (this.boxOpen) {
            if (this.boxItem == null) {
                System.out.println("В коробке пусто");
            } else {
                System.out.println("Вбыросили предмет: " + this.boxItem + " из коробки");
                this.boxItem = null;
            }
        } else {
            System.out.println("Коробка закрыта, предмет в ней барахтается, но никак не выпадает... =(");
        }
    }

    public void boxInfo() {
        System.out.println("Информация о коробке:\nДлина: " + this.boxLength + "\nШирина: " + this.boxWidth +
                "\nВысота: " + this.boxHeight + "\nЦвет: " + this.boxColor + "\nКоробка " + ((this.boxOpen) ? "открыта" : "закрыта") +
                "\nВ коробле лежит: " + ((this.boxItem == null) ? "ничего" : this.boxItem));

    }

}

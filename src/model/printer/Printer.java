package model.printer;

public class Printer {

    public void print(){
        System.out.println("打印机能打印");
    }
}

class ColorPrinter extends Printer{
    public void print(){
        System.out.println("彩色打印机能打印彩色纸");
    }
}

class BWPrinter extends Printer{
    public void print(){
        System.out.println("黑白打印机只能打印黑白纸");
    }
}

class Main{
    public static void main(String[] args) {
        Printer printer = new Printer();
        Printer colorPrinter = new ColorPrinter();
        Printer bwPrinter = new BWPrinter();
        printer.print();
        colorPrinter.print();;
        bwPrinter.print();
    }
}
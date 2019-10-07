package edu.touro.mco152.bm;

import java.util.Scanner;

public class cmd{
    public static String wantDefult(Scanner keyboard){
        System.out.println("do you want to use the defults Y/N");
        return keyboard.nextLine();
    }
    public  static  int setNumOfMarks(Scanner keyboard){
        System.out.println("What is the number of marks you want?");
        return keyboard.nextInt();
    }
    public static int setNumOfBlocks(Scanner keyboard){
        System.out.println("What is the number of blocks you want");
        return keyboard.nextInt();
    }
    public static int setSizeOfBlocks(Scanner keyboard){
        System.out.println("What is the size of each block");
        return keyboard.nextInt();
    }
    public static void updateLegend() {
        System.out.println("0" + App.writeTest);
        System.out.println("1"+ App.writeTest);
        System.out.println("2"+ App.writeTest + App.showMaxMin);
        System.out.println("3" + App.writeTest + App.showMaxMin);

        //chart.getXYPlot().getRenderer().setSeriesVisibleInLegend(4, App.readTest);
        //chart.getXYPlot().getRenderer().setSeriesVisibleInLegend(5, App.readTest);
        //chart.getXYPlot().getRenderer().setSeriesVisibleInLegend(6, App.readTest&&App.showMaxMin);
        //chart.getXYPlot().getRenderer().setSeriesVisibleInLegend(7, App.readTest&&App.showMaxMin);
    }
}


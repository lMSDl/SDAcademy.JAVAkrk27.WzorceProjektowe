package pl.sdacademy.java.krk27.wpj.solid;

import jdk.jshell.spi.ExecutionControl;

public class I {

    interface IPdfFormatter
    {
        void toPdf();
    }

    interface IExcelFormatter
    {
        void toExcel();
    }

//    interface IFormatter extends IPdfFormatter, IExcelFormatter
//    {
//    }

    class Report implements IPdfFormatter, IExcelFormatter
    {
        public void toExcel()
        {
            System.out.println("Excel generated");
        }

        public void toPdf()
        {
            System.out.println("Pdf generated");
        }
    }

    class Poem implements IPdfFormatter
    {
        public void toPdf()
        {
            System.out.println("Pdf generated");
        }
    }
}

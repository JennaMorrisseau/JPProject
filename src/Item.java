//code by Jenna Morrisseau
//Interface Item to set up values and methods needed - everything is implemented in Product
//version 1 - 9.30.18


public interface Item {
        String manufacturer = "OracleProduction";

        void setProductionNumber(int pn);
        void setName(String name);
        String getName();
        String getManufactureDate();
        int getSerialNumber();
    }






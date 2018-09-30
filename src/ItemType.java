//code by Jenna Morrisseau
//enum class ItemType that has the fixed number of variables and the code that goes with them.
//version 1 - 9.30.18


public enum ItemType {
    AUDIO ("AU"),
    Visual ("VI"),
    AudioMobile ("AM"),
    VisualMobile ("VM");

    String code;

    //method to return the values in the parenthasis above
    ItemType(String code) {
        this.code = code;
    }


}


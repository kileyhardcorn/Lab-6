class Tree {

    private String treeName;
    private String treeType;
    private Boolean leavesFall;
    private String leafColor;

    public Tree() {
        treeName = "";
        treeType = "";
        leavesFall = false;
        leafColor = "";
    }

    public Tree(String aName, String aType, Boolean aFall, String aColor) {
        treeName = aName;
        treeType = aType;
        leavesFall = aFall;
        leafColor = aColor;
    }

    void setName(String theName) {
        treeName = theName;
    }

    void setType(String theType) {
        treeType = theType;
    }

    void setFall(Boolean theFall) {
        leavesFall = theFall;
    }

    void setColor(String theColor) {
        leafColor = theColor;
    }

    String getName() {
        return treeName;
    }

    String getType() {
        return treeType;
    }

    Boolean getFall() {
        return leavesFall;
    }

    String getColor() {
        return leafColor;
    }

    public void print() {

        if (leavesFall == true) {
            System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently "
                    + leafColor + ". It does lose its leaves for the winter.");
        }

        else if (leavesFall != true) {
            System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently "
                    + leafColor + ". It does not lose its leaves for the winter.");
        }
    }
}
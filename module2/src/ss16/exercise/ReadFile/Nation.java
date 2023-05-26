package ss16.exercise.ReadFile;

public class Nation {
    private int id;
    private String symbolName;
    private String name;
    public Nation(int id, String symbolName,String name){
        this.id = id;
        this.symbolName = symbolName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", symbolName='" + symbolName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public String getInfoToCSV(){
        return this.id+","+this.symbolName+","+this.name;
    }
}

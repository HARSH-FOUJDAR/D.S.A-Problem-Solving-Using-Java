class JavaStreamApi {

    public int id;
    public String Employeename;
    public int Salery;


    JavaStreamApi(int id, String Employeename, int Salery) {
        this.id = id;
        this.Employeename = Employeename;
        this.Salery = Salery;
    }

    public int getSalery() {
        return Salery;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public int getid() {
        return id;
    }

    public String toString() {
        return id + " " + Employeename + " " + Salery;
    }
}




public enum Branch {

    LA("Basic"), Boston("Loan"), Bangalore("Full"), Mumbai("Full");

    String serviceLevel;
    private Branch(String serviceLevel){
        this.serviceLevel = serviceLevel;
    }

    public String getServiceLevel(){
        return serviceLevel;
    }


}

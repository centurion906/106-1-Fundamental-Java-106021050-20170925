public class Student {
    public String name, sex, dep, Eng, Chinese, Math;
    public Student(String name1, String sex1, String dep1 ,String Eng1, String Chinese1, String Math1){
        name = name1;
        sex = sex1;
        dep = dep1;
        Eng = Eng1;
        Chinese = Chinese1;
        Math = Math1;
    }
    public void setName(String name2){    // 11~27 設定學生資訊(不須回傳 所以不用return)
        name = name2;
    }
    public void setSex(String sex2){
        sex = sex2;
    }
    public void setDep(String dep2){
        dep = dep2;
    }
    public void setEng(String Eng2){
        Eng = Eng2;
    }
    public void setChinese(String Chinese2){
        Chinese = Chinese2;
    }
    public void setMath(String Math2){
        Math = Math2;
    }
    public String getName() { return name; }
    public String getSex() { return sex; }
    public String getDep() {return dep;}
    public String getEng() { return Eng; }
    public String getChinese() { return Chinese; }
    public String getMath() { return Math; }
    public void showAll(){
        System.out.println("------------------------------------------");
        System.out.println("name = "+this.getName());
        System.out.println("sex = "+this.getSex());
        System.out.println("dep = "+this.getDep());
        System.out.println("Eng = "+this.getEng());
        System.out.println("Chinese = "+this.getChinese());
        System.out.println("Math = "+this.getMath());
        System.out.println("------------------------------------------");
    }
}


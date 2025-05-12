public class Parent extends Person{
    private String name;
    private int age;
    private Parent spouse=null;
    private Child[] children =new Child[0];
    public Parent(String name, int age, Parent spouse){
        super(name, age);
        this.spouse=spouse;
    }
    public Parent(String name, int age){
        super(name,age);
    }
    public Parent getSpouse(){
        return this.spouse;
    }
    public Child[] getChildren(){
        return this.children;
    }
    public void setSpouse(Parent spouse){
        this.spouse=spouse;
    }
    public void setChildren(Child[] children){
        this.children=children;
    }
    public void addChild(Child child){
        Child[] newChildren=new Child[this.children.length+1];
        for(int i=0;i<this.children.length;i++){
            newChildren[i]=this.children[i];
        }
        newChildren[this.children.length]=child;
        this.children=newChildren;
    }
}


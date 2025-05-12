public class Child extends Person{
    private Parent parent1, parent2;
    private Child[] siblings=new Child[0];
    public Child(String name, int age, Parent parent1, Parent parent2){
        super(name, age);
        this.parent1=parent1;
        this.parent2=parent2;
    }
    public Parent getParent1(){
        return this.parent1;
    }
    public Parent getParent2(){
        return this.parent2;
    }
    public void getSiblings(Child[] sibiling){
        this.siblings=sibiling;
    }
    public Child[] getSiblings(){
        return this.siblings;
    }
    public void setSiblings(Child[] siblings){
        this.siblings=siblings;
    }
    public void addSibling(Child child){
        Child[] newSibiling=new Child[this.siblings.length+1];
        for(int i=0;i<this.siblings.length;i++){
            newSibiling[i]=this.siblings[i];
        }
        newSibiling[this.siblings.length]=child;
        this.siblings=newSibiling;
    }
}
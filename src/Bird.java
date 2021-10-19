public class Bird extends Animal{
    public Bird(int age, char gender, int weightInPounds){
        super(age, gender, weightInPounds);
    }

    public void fly(){
        System.out.println("I am flying.....");
    }

    public void move(){
        System.out.println("I am a bird by flapping my wings....");
    }
}

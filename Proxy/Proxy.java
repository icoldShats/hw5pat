public class Proxy implements RegularImage{
    private String name;
    private BigImage realImage;
    public Proxy(String name){
        this.name=name;
    }
    @Override
    public void display(){
        System.out.println("mini Image: "+ name);
    }
    public void fullImage(){
        if(realImage==null){
            realImage=new BigImage(name);
        }
        realImage.display();
    }
}

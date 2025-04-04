public class BigImage implements RegularImage{
    private String image;
    public BigImage(String image){
        this.image=image;
        System.out.println("create image "+image);
    }
    @Override
    public void display(){
        System.out.println("full image "+ image);
    }
}

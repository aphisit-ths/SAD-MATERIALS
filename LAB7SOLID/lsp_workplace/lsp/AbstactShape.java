public abstract class AbstactShape {
    public int width;
    public int hight;
    
    AbstactShape(){

    };
    AbstactShape(int width , int hight){
        this.width = width;
        this.hight = hight;
    };

    public int getHight() {
        return hight;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return width * hight;
    }

}

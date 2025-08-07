package Ex3;

public class fan {
    private int speed;
    private boolean status;
    private int radius;
    private String color;

    public fan(){};
    public fan(int speed, boolean status, int radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
        }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean turnOn(){
        if(!this.status){
            this.status = true;
            System.out.println("Fan is on");
            return true;
        }
        return true;
    }
    public boolean turnOff(){
        if(this.status){
            this.status = false;
            System.out.println("Fan is off");
            return false;
        }
        return false;
    }
    public void checkStatus(){
        if(this.status){
            System.out.println("Fan is on");
        }else{
            System.out.println("Fan is off");
        }
    }
    public void speedUp(){
        if(this.status){
            if(this.speed <= 3){
                speed ++;
                System.out.println("Speed is up: "+ this.speed);
            }else{
                System.out.println("speed is up max");
            }
        }else{
            System.out.println("fan is off can't speed up");
        }
    }
    public void speedDown(){
        if(this.status){
            if(this.speed >1 ){
                speed --;
                System.out.println("Speed is down: "+ this.speed);
            }else{
                System.out.println("speed is down min");
            }
        }else{
            System.out.println("fan is off can't speed down");
        }
    }
    public void getInfor(){
     if(this.status){
         System.out.println("Speed:"+ getSpeed() + " color: "+ getColor()+ " Radius "+getRadius()+" Fan is on");
     }else{
         System.out.println("Fan is off can't get infor");
     }
    }

}

public class Program {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.setX(10);
        point.setY(10);
        float[] array1 = new float[2];
        array1 = point.getXY();
        for(float a:array1){
            System.out.println(a);
        }
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(10,10,20,20);
        System.out.println(movablePoint);
    }
}

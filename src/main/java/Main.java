import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(2, 3, 1);
        System.out.println("Volume: " + cuboid.getVolume());
    }
}
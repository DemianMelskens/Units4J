import metric.distance.Distance;
import metric.surface.Surface;
import metric.volume.Volume;
import metric.weight.Weight;

import java.util.List;

public class Main {

    public static void main(final String[] args) {
        Volume m3 = Volume.meter3(1);
        Volume kl = Volume.kiloliter(20);

        System.out.println(m3.add(kl));
    }
}

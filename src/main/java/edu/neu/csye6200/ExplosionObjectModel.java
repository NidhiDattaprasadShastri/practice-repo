package edu.neu.csye6200;

import java.util.List;

public class ExplosionObjectModel {
    public static void demo() {
        GunShot gunShot = new GunShot();
        Grenade grenade = new Grenade();
        GunShotA gunShotA = new GunShotA();
        GrenadeA grenadeA = new GrenadeA();
        GunShotI gunShotI = new GunShotI();
        GrenadeI grenadeI = new GrenadeI();

        System.out.println("\n\n== ExplosionModel (Concrete API) ==");
        new ExplosionModel(gunShot);
        new ExplosionModel(grenade);

        System.out.println("\n\n== AbstractExplosionModel (Abstract API) ==");
        new AbstractExplosionModel(gunShotA);
        new AbstractExplosionModel(grenadeA);

        System.out.println("\n\n== ExplodableModel (Interface API) ==");
        new ExplodableModel(gunShotI);
        new ExplodableModel(grenadeI);

        System.out.println("\n\n== Object API ==");
        List<Object> all = List.of(gunShot, grenade, gunShotA, grenadeA, gunShotI, grenadeI);
        all.forEach(System.out::println);
    }
}

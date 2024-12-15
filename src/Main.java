import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialManagement manager = new MaterialManagement(10);
        manager.addMaterial(new CripsyFlour("f1", "Bột 1", LocalDate.now(), 1000, 1));
        manager.addMaterial(new CripsyFlour("f2", "Bột 2", LocalDate.now(), 6000, 2));
        manager.addMaterial(new CripsyFlour("f3", "Bột 3", LocalDate.now(), 3000, 3));
        manager.addMaterial(new CripsyFlour("f4", "Bột 4", LocalDate.now(), 2000, 4));
        manager.addMaterial(new CripsyFlour("f5", "Bột 5", LocalDate.now(), 5000, 5));
        manager.addMaterial(new Meat("m1", "Thịt 1", LocalDate.now(), 4000, 1));
        manager.addMaterial(new Meat("m2", "Thịt 2", LocalDate.now(), 11000, 2));
        manager.addMaterial(new Meat("m3", "Thịt 3", LocalDate.now(), 8000, 3));
        manager.addMaterial(new Meat("m4", "Thịt 4", LocalDate.now(), 9000, 4));
        manager.addMaterial(new Meat("m5", "Thịt 5", LocalDate.now(), 5000, 5));

        System.out.println("Danh sách vật liệu chưa sắp xếp: ");
        manager.displayMaterials();
        System.out.println("Tổng tiền: " + manager.getTotalRealMoney(true));
        System.out.println("Danh sách vật liệu đã sắp xếp theo giá: ");
        manager.sortMaterialsByCost();
        manager.displayMaterials();
        System.out.println("Chếnh lệch giữa chiết khấu và không chiết khấu: " + (manager.getTotalRealMoney(false) - manager.getTotalRealMoney(true)));
    }
}

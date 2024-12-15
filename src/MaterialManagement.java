public class MaterialManagement {
    private Material[] materials;
    private int count;

    public MaterialManagement(int size) {
        materials = new Material[size];
        count = 0;
    }
    public void addMaterial(Material material) {
        if (count < materials.length) {
            materials[count++] = material;
        } else {
            System.out.println("Danh sách đã đầy, không thể thêm");
        }
    }
    public void deleteMaterial(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                for (int j = i; j < count-1; j++) {
                    materials[j] = materials[j+1];
                }
                materials[count-1] = null;
                break;
            }
        }
    }

    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                materials[i] = newMaterial;
                break;
            }
        }
    }
    public void displayMaterials() {
        for (Material material : materials) {
            if (material != null) {
                System.out.println(material.getName() + ": " + material.getAmount());
            }
        }
    }

    public void sortMaterialsByCost() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (materials[i].getAmount() > materials[j].getAmount()) {
                    Material temp = materials[i];
                    materials[i] = materials[j];
                    materials[j] = temp;
                }
            }
        }
    }
    public double getTotalRealMoney(boolean withDiscount) {
        double totalMoney = 0;
        for(Material material : materials) {
            if (material != null) {
                if (withDiscount && material instanceof Discount){
                     totalMoney += ((Discount)material).getRealMoney();
                } else {
                    totalMoney += material.getAmount();
                }
            }
        }
        return totalMoney;
    }
}

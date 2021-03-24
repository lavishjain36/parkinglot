public class Parking {
    Vehicle[] slots;


    public Parking(int numSlot) {
        slots = new Vehicle[numSlot];
        System.out.println("Created a parking lot with "+numSlot+ " slots");
    }

    public int  entry(String regNum, String col){

        Car car = new Car(regNum, col);

        int slot = -1;
        for(int i=0; i<slots.length; i++){
            if(slots[i] == null){
                slot = i;
                break;
            }
        }
        if(slot == -1){
            System.out.println("Sorry, parking lot is full");
            return -1;
        }
        slots[slot] = car;

        System.out.println("Allocated slot number: "+(slot+1));
        return (slot+1);
    }

    public int  exit(int slot){

        if(slot < 1 || slot > slots.length){
            System.out.println("Only "+ slots.length + " available");
            return -1;
        }

        Car car = (Car)slots[slot-1];
        slots[slot-1] = null;

        System.out.println("Slot number "+ (slot) +" is free");
        return slot;
    }
}

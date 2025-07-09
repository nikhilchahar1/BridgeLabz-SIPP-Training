public class CircularTour {
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0;
        int deficit = 0;
        int balance = 0;

        for (int i = 0; i < n; i++) {
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                // Cannot start from current start index
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };

        int start = findStartingPoint(pumps);

        if (start == -1)
            System.out.println("No feasible starting point.");
        else
            System.out.println("Start at petrol pump index: " + start);
    }
}

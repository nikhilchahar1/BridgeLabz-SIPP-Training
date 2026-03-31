class Process {
    int id, bt, rt, wt = 0, tat = 0;
    Process next;

    Process(int id, int bt) {
        this.id = id;
        this.bt = this.rt = bt;
    }
}

class RoundRobinScheduler {
    Process head = null;

    // Add process at end
    void add(int id, int bt) {
        Process p = new Process(id, bt);
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    // Execute Round Robin
    void execute(int tq) {
        int time = 0, n = 0, totalWT = 0, totalTAT = 0;
        Process curr = head;

        // Count processes
        Process tmp = head;
        do { n++; tmp = tmp.next; } while (tmp != head);

        System.out.println("Round Robin Execution:");
        while (true) {
            boolean done = true;
            tmp = curr;
            do {
                if (tmp.rt > 0) {
                    done = false;
                    int exec = Math.min(tq, tmp.rt);
                    System.out.println("P" + tmp.id + " executed for " + exec + " units.");
                    time += exec;
                    tmp.rt -= exec;
                    if (tmp.rt == 0) {
                        tmp.tat = time;
                        tmp.wt = tmp.tat - tmp.bt;
                        totalWT += tmp.wt;
                        totalTAT += tmp.tat;
                    }
                }
                tmp = tmp.next;
            } while (tmp != curr);
            if (done) break;
        }

        // Display summary
        System.out.println("\nProcess\tBT\tWT\tTAT");
        tmp = head;
        do {
            System.out.println("P" + tmp.id + "\t" + tmp.bt + "\t" + tmp.wt + "\t" + tmp.tat);
            tmp = tmp.next;
        } while (tmp != head);

        System.out.printf("\nAverage WT: %.2f, Average TAT: %.2f\n", (float)totalWT/n, (float)totalTAT/n);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();
        rr.add(1, 10);
        rr.add(2, 5);
        rr.add(3, 8);
        rr.execute(4);
    }
}

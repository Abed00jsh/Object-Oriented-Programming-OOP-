public class Set {
    private int[] elements;
    private int maxSize;
    private int counter;

    
    public Set() {
        this(10);
    }

    
    public Set(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new int[maxSize];
        this.counter = 0;
    }

    
    public Set(int... a) {
        this(Math.max(a.length, 2)); 
        for (int num : a) {
            add(num); 
        }
    }

    
    public Set(Set other) {
        this(other.maxSize);
        for (int i = 0; i < other.counter; i++) {
            add(other.elements[i]);
        }
    }

    
    public boolean equals(Set other) {
        if (this.counter != other.counter) {
            return false;
        }
        for (int i = 0; i < this.counter; i++) {
            boolean found = false;
            for (int j = 0; j < other.counter; j++) {
                if (this.elements[i] == other.elements[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    
    public Set union(Set set2) {
        Set newSet = new Set(this.maxSize + set2.maxSize);
        for (int i = 0; i < this.counter; i++) {
            newSet.add(this.elements[i]);
        }
        for (int i = 0; i < set2.counter; i++) {
            newSet.add(set2.elements[i]);
        }
        return newSet;
    }

    
    public Set intersect(Set set2) {
        Set newSet = new Set(Math.min(this.counter, set2.counter));
        for (int i = 0; i < this.counter; i++) {
            if (set2.contains(this.elements[i])) {
                newSet.add(this.elements[i]);
            }
        }
        return newSet;
    }

    
    public boolean subset(Set set2) {
        for (int i = 0; i < this.counter; i++) {
            if (!set2.contains(this.elements[i])) {
                return false;
            }
        }
        return true;
    }

   
    public int[] toArray() {
        int[] newArray = new int[this.counter];
        System.arraycopy(this.elements, 0, newArray, 0, this.counter);
        return newArray;
    }

    
    public Set subtract(Set set2) {
        Set result = new Set(this.maxSize);
        for (int i = 0; i < this.counter; i++) {
            if (!set2.contains(this.elements[i])) {
                result.add(this.elements[i]);
            }
        }
        return result;
    }

    
    private boolean contains(int num) {
        for (int i = 0; i < this.counter; i++) {
            if (this.elements[i] == num) {
                return true;
            }
        }
        return false;
    }

   
    public void add(int num) {
        if (contains(num)) {
            return; 
        }
        if (counter >= maxSize) {
            return; 
        }
        elements[counter] = num;
        counter++;
    }

    
    public void show() {
        int[] result = toArray();
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
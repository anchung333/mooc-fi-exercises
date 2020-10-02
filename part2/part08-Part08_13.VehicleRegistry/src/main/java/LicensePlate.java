
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate converted = (LicensePlate) compared;
        
        if (this.country.equals(converted.country) && 
            this.liNumber.equals(converted.liNumber)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = this.liNumber.hashCode();
        return hash;
    }

}

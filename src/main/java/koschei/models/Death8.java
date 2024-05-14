package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Death8 {
    private final Needle7 needle;
@Autowired
    public Death8(Needle7 needle) {
        this.needle = needle;
    }
    @Override
    public String toString() {
        return needle.toString();
    }



    }





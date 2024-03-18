package scaler.beginner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Point {
    public int x;
    public int y;

    @Override
    protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }

}

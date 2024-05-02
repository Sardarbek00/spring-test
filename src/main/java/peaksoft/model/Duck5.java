package peaksoft.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Duck5 {

    private final Egg6 egg6;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg6.toString();
    }
}

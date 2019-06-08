package pl.gl.sdp.game.bl;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class TokenGnerator {
    String getToken() {
        return RandomStringUtils.randomAlphanumeric(20);
    }
}

package standard;

import java.nio.charset.StandardCharsets;

public class HdmiImpl implements Hdmi {
    @Override
    public void afficher(Byte[] data) {
        System.out.println("**********************HDMI************************");
        System.out.println(new String(data, StandardCharsets.UTF_8));
        System.out.println("**********************HDMI************************");

    }
}

package io.arukas;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Created by IntelliJ IDEA. <br/>
 *
 * @Auther: 牛玉贤 <br/>
 * @Date: 2018/8/30 20:24 <br/>
 * @Email: ncc0706@gmail.com <br/>
 */
public class QRCodeTest {

    public static void main(String[] args) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        BitMatrix bitMatrix = qrCodeWriter.encode("~https://www.baidu.com", BarcodeFormat.QR_CODE, 420, 420);
        Path path = FileSystems.getDefault().getPath("D:/qrcode.png");
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }

}
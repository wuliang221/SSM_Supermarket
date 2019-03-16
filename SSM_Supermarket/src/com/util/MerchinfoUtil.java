/*package com.util;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import org.jbarcode.JBarcode;
import org.jbarcode.encode.Code128Encoder;
import org.jbarcode.paint.EAN13TextPainter;
import org.jbarcode.paint.WidthCodedPainter;
import org.jbarcode.util.ImageUtil;
public class MerchinfoUtil { 
    *//**
     * 生成商品条形码
     *
     * @param filePath
     *            商品条形码图片存放路径：../xxx/yyy/
     * @param jbarCode
     *            商品条形码：8位、13位
     * @param format
     *            商品条形码图片格式：.gif/.png/.jpg/.jpeg
     * @return 图片存放路径+图片名称+图片文件类型
     *//*
    public String createBarCode(String filePath, String jbarCode, String format) {
    	
        String barCodeName = jbarCode + format;
 
        try {
            BufferedImage bi = null;          
            JBarcode productBarcode = new JBarcode(Code128Encoder.getInstance(),
                    WidthCodedPainter.getInstance(),
                    EAN13TextPainter.getInstance());
 
            bi = productBarcode.createBarcode(jbarCode);
            saveToJPG(bi, filePath, barCodeName);
            // 尺寸，面积，大小 密集程度  
            productBarcode.setXDimension(Double.valueOf("0.5").doubleValue());  
            // 高度 10.0 = 1cm 默认1.5cm  
            productBarcode.setBarHeight(Double.valueOf("30").doubleValue());  
            // 宽度  
            productBarcode.setWideRatio(Double.valueOf(30).doubleValue());  
            //是否显示字体  
            productBarcode.setShowText(true);
            return filePath + barCodeName;
        } catch (Exception localException) {
            localException.printStackTrace();
            return null;
        }
    }
    *//**
     * 生成JPEG图片
     *
     * @param paramBufferedImage
     * @param paramString
     *//*
    @SuppressWarnings("unused")
    private void saveToJPG(BufferedImage paramBufferedImage, String filePath,
            String fileName) {
        saveToFile(paramBufferedImage, filePath, fileName, "jpeg");
    }
 
    *//**
     * 生成PNG图片
     *
     * @param paramBufferedImage
     * @param paramString
     *//*
    @SuppressWarnings("unused")
    private void saveToPNG(BufferedImage paramBufferedImage, String filePath,
            String fileName) {
        saveToFile(paramBufferedImage, filePath, fileName, "png");
    }
 
    *//**
     * 保存图片文件
     *
     * @param paramBufferedImage
     *            图片流
     * @param filePath
     *            文件路径
     * @param imgName
     *            图片参数
     * @param imgFormat
     *            图片格式
     *//*
    private  void saveToFile(BufferedImage paramBufferedImage, String filePath,
            String imgName, String imgFormat) {
    	
        try {
        	System.out.println("saveToFile");
            FileOutputStream fileOutputStream = null;
            try {
                
                String dirPath = filePath;
                
                File dirFile = new File(dirPath);
                if (!dirFile.exists()) {
                    dirFile.mkdirs();
                }
                String imgPath = dirPath + imgName;
                fileOutputStream = new FileOutputStream(imgPath);
            } catch (Exception e) {
                System.out.println("Create Img File Error：" + e.toString());
            }
            ImageUtil.encodeAndWrite(paramBufferedImage, imgFormat,
                    fileOutputStream, 96, 96);
            fileOutputStream.close();
        } catch (Exception localException) {
            System.out.println("Save Img File Error：" + localException);
            localException.printStackTrace();
        }
    }
}

*/
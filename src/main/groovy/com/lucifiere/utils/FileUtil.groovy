package com.lucifiere.utils

import java.nio.charset.Charset
import java.text.SimpleDateFormat
import java.util.zip.ZipEntry
import java.util.zip.ZipFile

final class FileUtil {

    public static final String ZIP_DIR = "src/main/resources/tmpZip/"

    static void unZip(byte[] fileByte) {
        File file = new File(ZIP_DIR, "tmp.zip")
        file.createNewFile()
        OutputStream output = new FileOutputStream(file)
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(output)
        bufferedOutput.write(fileByte)
        unZip(file, ZIP_DIR)
    }

    static void unZip(File zipFile, String descDir) throws IOException {

        ZipFile zip = new ZipFile(zipFile, Charset.forName("GBK"))

        String name = """${new SimpleDateFormat("yyyy-MM-ss").format(new Date())}-${System.currentTimeMillis()}"""
        File pathFile = new File(descDir + name)
        if (!pathFile.exists()) {
            pathFile.mkdirs()
        }

        for (Enumeration<? extends ZipEntry> entries = zip.entries(); entries.hasMoreElements();) {
            ZipEntry entry = (ZipEntry) entries.nextElement()
            String zipEntryName = entry.getName()
            InputStream stream = zip.getInputStream(entry)
            String outPath = (descDir + name + "/" + zipEntryName).replaceAll("\\*", "/")

            File file = new File(outPath.substring(0, outPath.lastIndexOf('/')))
            if (!file.exists()) {
                file.mkdirs()
            }
            if (new File(outPath).isDirectory()) {
                continue
            }

            FileOutputStream out = new FileOutputStream(outPath)
            byte[] buf1 = new byte[1024]
            int len
            while ((len = stream.read(buf1)) > 0) {
                out.write(buf1, 0, len)
            }
            stream.close()
            out.close()
        }
    }

}

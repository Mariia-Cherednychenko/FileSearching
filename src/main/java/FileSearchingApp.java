


import java.io.File;

public class FileSearchingApp {
    /*Написать метод
File findAbsoluteFile(File dir, String fileName)
который ищет файл с именем fileName в папке dir и во всех ее вложенных папках,
        если файл найден - возвращает его,
        если нет - null*/

public File findAbsoluteFile (File dir, String fileName){
    File absoluteFile = null;

    if (dir.isDirectory()){
        File[] listFile = dir.listFiles();
        if (listFile!=null){
            for (File file : listFile) {
                if (file.isFile()){
                    if (file.getName()==fileName){
                        absoluteFile=file.getAbsoluteFile();
                        break;
                    }

                }
                else findAbsoluteFile(file,fileName);
            }
        }
    }

    return absoluteFile;
}
}

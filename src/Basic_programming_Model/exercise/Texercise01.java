package Basic_programming_Model.exercise;

import B_Q_S.Queue;
import Standard.StdOut;

import java.io.File;

public class Texercise01 {

    private Queue<String> fileQueue;

    public Texercise01() {
        fileQueue = new Queue<>();
    }

    private void listFiles(File file, int depth) {
        if (!file.exists()) {
            return;
        }

        //Add directory
        addFileToQueue(file, depth);

        File[] fileList = file.listFiles();

        if (fileList != null) {
            for(File fileItem : fileList) {

                if (fileItem.isFile()) {
                    addFileToQueue(fileItem, depth);
                } else if (fileItem.isDirectory()) {
                    listFiles(fileItem, depth+1);
                }
            }
        }
    }

    private void addFileToQueue(File file, int depth) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < depth; i++) {
            stringBuilder.append("  ");
        }

        stringBuilder.append(file.getName());
        fileQueue.enqueue(stringBuilder.toString());
    }

    public static void main(String[] args) {
        String folderPath = args[0];
        File folder = new File(folderPath);

        Texercise01 listFiles = new Texercise01();
        listFiles.listFiles(folder, 0);

        for(String fileName : listFiles.fileQueue) {
            StdOut.println(fileName);
        }
    }



//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\17395\\IdeaProjects\\VUE\\Algorithm\\src\\Basic_programming_Model\\Bags_Aueues_stacks");
//        System.out.println(file.getName());
//
//        File[] filelist = file.listFiles();
//        for(File item: filelist){
//            if(item.isDirectory()){
//                System.out.println(item.getName());
//            }
//            if(item.isFile()){
//                System.out.println(" "+item.getName());
//            }
//        }
//    }
}

package ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "=====================================\n";
    private String title  = "이름\t  주소 \t\t 전화번호   \n";
    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("james \t"); // append : 이어주는 아이
        buffer.append("seoul korea \t");
        buffer.append("010-2032-3333 \n");

        buffer.append("tomas \t");
        buffer.append("newyork us \t");
        buffer.append("010-1234-5678\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}

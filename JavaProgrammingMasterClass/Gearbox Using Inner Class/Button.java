public class Button {
    private String title;
    private OnclickListener onclickListener;

    public Button(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setOnclickListener(OnclickListener onclickListener){
        this.onclickListener=onclickListener;
    }
    public void Onclick(){
        this.onclickListener.Onclick(this.title);
    }
    public interface OnclickListener{
        public void Onclick(String title);
    }
}

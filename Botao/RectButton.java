public class RectButton extends DefaultButton {
    @Override
    public void setText(String text) {
        this.text = text.trim().substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
}

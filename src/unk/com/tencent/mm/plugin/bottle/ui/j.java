package unk.com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.storage.o;

final class j
  implements AdapterView.OnItemClickListener
{
  j(BottleConversationUI paramBottleConversationUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    o localo = (o)BottleConversationUI.a(this.atm).getItem(paramInt);
    Intent localIntent = new Intent(this.atm, BottleChattingUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("Chat_User", localo.getUsername());
    this.atm.startActivity(localIntent);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.ui.j
 * JD-Core Version:    0.6.2
 */
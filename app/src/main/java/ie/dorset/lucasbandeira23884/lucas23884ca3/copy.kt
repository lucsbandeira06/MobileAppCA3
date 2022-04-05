//package ie.dorset.lucasbandeira23884.lucas23884ca3
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.card_view.view.*
//
//class copy(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {
//
//
//    val UserList = listOf("torvalds", "Rich-Harris", "JakeWharton", "newtoneinstein", "Lucsbandeira06")
//
//    val images = intArrayOf(R.drawable.lucasbandeira)
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
//        val layoutInflater = LayoutInflater.from(parent?.context)
//        val cellForRow = layoutInflater.inflate(R.layout.card_view, parent, false)
//        return CustomViewHolder(cellForRow)
//    }
//
//    override fun getItemCount(): Int {
//        return homeFeed.users.size;
//    }
//
//
//    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
//        val user = homeFeed.users.get(position)
//        holder.view.title_view?.text = user.name
//        holder.view.follower_info?.text = user.followers
//        holder.view.following_info?.text = user.following
//        holder.view.picture_view.setImageResource(images[position])
//    }
//}
//
//class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){
//
//}
//

package com.example.mynewsbyramy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the News Article at the given position in the list of NewsArticle
        News currentNewsArticle = getItem(position);

        TextView webTitleTextView = listItemView.findViewById(R.id.webTitle_textView);
        TextView sectionNameTextView = listItemView.findViewById(R.id.sectionName_textView);
        TextView authorTextView = listItemView.findViewById(R.id.author_textView);
        TextView dateView = listItemView.findViewById(R.id.date);

        String title = currentNewsArticle.getWebTitle();
        String publishDate = currentNewsArticle.getWebPublicationDate();

        // Check whether the originalLocation string contains the " of " text
        String authorPart;

        if (title.contains("|")) {
            authorPart = title.substring(title.indexOf(" | ") + 2);
            title = title.substring(0, title.indexOf("|"));
        } else {
            // Otherwise, there is no " | " text in the title string.
            authorPart = getContext().getString(R.string.no_Author);

        }


        webTitleTextView.setText(title);
        sectionNameTextView.setText(currentNewsArticle.getSectionName());
        authorTextView.setText(currentNewsArticle.getAuthor());
        authorTextView.setText(authorPart);

        String formattedDate = formatDate(publishDate);

        dateView.setText(formattedDate);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


    private String formatDate(String dateObj) {
        String dateFormatted = "";
        SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        SimpleDateFormat outputDate = new SimpleDateFormat("LLL dd, yyyy", Locale.getDefault());
        try {
            Date newDate = inputDate.parse(dateObj);
            return outputDate.format(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateFormatted;
    }
}
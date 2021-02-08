package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public final class GlideUtils {

    private GlideUtils() {}

    // Load Images
    public static void loadImage(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Uri image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Uri image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Uri image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    // Loads Image in Circular form
    public static void loadCircularImage(Context context, String image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, String image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, String image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Bitmap image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Drawable image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Uri image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Uri image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Uri image, int placeholder, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, String image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, String image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, String image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Bitmap image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Drawable image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Uri image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Uri image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Uri image, ImageView holder) {
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Loads GIFs
    public static void loadGif(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    // Load image without placeholder
    public static void loadGif(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Context context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(Fragment context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadGif(FragmentActivity context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    // Loads Circular GIFs
    public static void loadCircularGif(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Context context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(Fragment context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGif(FragmentActivity context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

}

package com.example.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseloader extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private Context context ;
    private static final String DATABASE_NAME = "myproject.db";
    private static final String TABLE_NAME = "myproject";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_PRODUCT_NAME = "PRODUCT_NAME";
    private static final String COLUMN_PRODUCT_PRICE = "PRODUCT_PRICE";
    private static final String COLUMN_PRODUCT_QUANTITY = "PRODUCT_QUANTITY";
    private static final String COLUMN_IMG = "PRODUCT_IMG";
    public databaseloader(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +" (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PRODUCT_NAME + " TEXT, " + COLUMN_PRODUCT_PRICE + " TEXT, " + COLUMN_PRODUCT_QUANTITY + " TEXT, " + COLUMN_IMG + " INTEGER);";
        db.execSQL(query);
        // we are adding some sample data in order to test the code
        try{
            addProduct(db,"MacBook Pro",23,23,23);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    // HELPER METHOD TO POPULATE THE DATABASE FOR NOW



    private void addProduct(SQLiteDatabase db, String name, double price, int qty, int imgId) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_PRODUCT_NAME, name);
        values.put(COLUMN_PRODUCT_PRICE, price);
        values.put(COLUMN_PRODUCT_QUANTITY, qty);
        values.put(COLUMN_IMG, imgId);
        db.insert(TABLE_NAME, null, values);
    }

}


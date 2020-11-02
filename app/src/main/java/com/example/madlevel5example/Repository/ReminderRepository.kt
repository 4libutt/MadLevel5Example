package com.example.madlevel5example.Repository

import android.content.Context
import com.example.madlevel5example.Model.Reminder
import com.example.madlevel5example.Dao.ReminderDao
import com.example.madlevel5example.Database.ReminderRoomDatabase

public class ReminderRepository(context: Context) {

    private var reminderDao: ReminderDao

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    suspend fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }


    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }
}

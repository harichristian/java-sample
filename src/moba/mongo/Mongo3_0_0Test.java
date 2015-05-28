package moba.mongo;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.UpdateOptions;
import mobagate.db.DbMongo;
import org.bson.Document;

/**
 * Created by hc on 4/7/15.
 */
public class Mongo3_0_0Test {
    public static void main(String[] args) {
//        MongoClient conn = new MongoClient("127.0.0.1");
//        MongoDatabase database = conn.getDatabase("mobagate");
//        MongoCollection<Document> collection = database.getCollection("testtest");
//        Document doc = collection.find().first();
//        System.out.println(doc);

//        MongoCollection<Document> collection = DbMongo.getInstance().getCollection("mobagate", "testtest");
//        Document doc = collection.find().first();
//        System.out.println(doc);

//        BasicDBObject found = new BasicDBObject();
//        found.put("name", "HARI");
//
//        // update, locate message for this thread
//        BasicDBObject values = new BasicDBObject();
//        values.append("name", "CHRISTIAN");
//        BasicDBObject changeto = new BasicDBObject("$set", values);
//
//        MongoCollection<Document> collection = DbMongo.getInstance().getCollection("mobagate", "testtest");
//        Document doc = collection.findOneAndUpdate(found, changeto);
//        System.out.println(doc);


        // find entry that is either not being processed by a thread (thread id 0)
        // or that is already picked up by the current thread
//        BasicDBList fvalues = new BasicDBList();
//        fvalues.add("2");
//
//        BasicDBObject found = new BasicDBObject();
//        found.put("name", new BasicDBObject("$in", fvalues));
//
//        // update, locate message for this thread
//        BasicDBObject values = new BasicDBObject();
//        values.append("name", "2");
//
//        BasicDBObject changeto = new BasicDBObject("$set", values);
//
//        MongoCollection<Document> collection = DbMongo.getInstance().getCollection("mobagate", "testtest");
//        Document doc = (Document) collection.findOneAndUpdate(found, changeto);
//        System.out.println(doc);

//        Document bdo = new Document();
//        bdo.put("SOURCE", "12345");
//        bdo.put("TARGET", "98700");
//        bdo.put("SKEY", "CUP");
//
//        Message saveMessage = new Message();
//        saveMessage.SDATE = MUtils.addMinute(new Date(), 2);
//        saveMessage.LDATE = new Date();
//        saveMessage.AMOUNT = 2000;
//        saveMessage.OPTIN = "0";
//        saveMessage.MHEAD = "";
//        saveMessage.SENDMODE = "PUSH";
//        saveMessage.COUNT = -1;
//
//        MongoCollection<Document> collection = DbMongo.getInstance().getCollection("mobagate", "testtest");
//        collection.updateOne(bdo, saveMessage.toDocument(), new UpdateOptions().upsert(true));

        Document bdo = new Document();
        bdo.put("name", "22");

        Document bdo2 = new Document();
        bdo2.put("name", "22");

        MongoCollection<Document> collection = DbMongo.getInstance().getCollection("mobagate", "testtest");
        collection.updateOne(bdo, new Document("$set", bdo2), new UpdateOptions().upsert(true));
    }
}

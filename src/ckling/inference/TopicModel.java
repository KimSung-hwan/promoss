package ckling.inference;

import java.lang.management.ManagementFactory;

import ckling.text.Text;

public class TopicModel {


	public static void main (String[] args)  {
		
		if (args == null || args.length == 0) {
			
			System.out.println("Please specify the model parameters. See readme.txt for details.");
					
			return;
		}
		
		
		
		PracticalInference pi = new PracticalInference();
		
		for (int i=0; i < args.length; i++) {

		if (args[i].equals("-directory")) 
			pi.directory = args[++i];
		
		if (args[i].equals("-save_prefix")) 
			pi.save_prefix = args[++i];
		
		if (args[i].equals("-T")) 
			pi.T = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-TRAINING_SHARE")) 
			pi.TRAINING_SHARE = Double.valueOf(args[++i]);
		
		if (args[i].equals("-delta_fix")) 
			pi.delta_fix = Double.valueOf(args[++i]);
		
		if (args[i].equals("-BATCHSIZE")) 
			pi.BATCHSIZE = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-BATCHSIZE_GROUPS")) 
			pi.BATCHSIZE_GROUPS = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-RUNS")) 
			pi.RUNS = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-BURNIN")) 
			pi.BURNIN = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-alpha_1")) 
			pi.alpha_1 = Double.valueOf(args[++i]);
		
		if (args[i].equals("-alpha_0")) 
			pi.alpha_0 = Double.valueOf(args[++i]);
		
		if (args[i].equals("-MIN_DICT_WORDS")) 
			pi.MIN_DICT_WORDS = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-language")) 
			pi.language = args[++i];
		
		if (args[i].equals("-stemming")) 
			pi.stemming = Boolean.valueOf(args[++i]);
		
		if (args[i].equals("-stopwords")) 
			pi.stopwords = Boolean.valueOf(args[++i]);
		
		if (args[i].equals("-INIT_RAND")) 
			pi.INIT_RAND = Double.valueOf(args[++i]);
		
		if (args[i].equals("-INIT_RAND")) 
			pi.INIT_RAND = Double.valueOf(args[++i]);
		
		if (args[i].equals("-BURNIN_DOCUMENTS")) 
			pi.BURNIN_DOCUMENTS = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-SAMPLE_ALPHA")) 
			pi.SAMPLE_ALPHA = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhokappa")) 
			pi.rhokappa = Double.valueOf(args[++i]);
		
		if (args[i].equals("-rhos")) 
			pi.rhos = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhotau")) 
			pi.rhotau = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhokappa_document")) 
			pi.rhokappa_document = Double.valueOf(args[++i]);
		
		if (args[i].equals("-rhos_document")) 
			pi.rhos_document = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhotau_document")) 
			pi.rhotau_document = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhokappa_group")) 
			pi.rhokappa_group = Double.valueOf(args[++i]);
		
		if (args[i].equals("-rhos_group")) 
			pi.rhos_group = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-rhotau_group")) 
			pi.rhotau_group = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-BATCHSIZE_ALPHA")) 
			pi.BATCHSIZE_ALPHA = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-SAVE_STEP")) 
			pi.SAVE_STEP = Integer.valueOf(args[++i]);
		
		if (args[i].equals("-processed")) 
			pi.processed = Boolean.valueOf(args[++i]);
		
		if (args[i].equals("-epsilon")) {
			String[] argssplit = args[++i].split(",");
			double[] epsilon = new double[argssplit.length]; 
			for (int j=0;j<epsilon.length;j++) {
				epsilon[j] = Double.valueOf(argssplit[j]);
			}
			pi.epsilon = epsilon;
		}
				
		}
		
		pi.initialise();
		pi.run();

		//food8();

		//food25();

		//food8ppx();

		//porn25();
		
		//multi();
		
		//lkml50();
		//ppxporn3();
		//topicporn();
		//kappaporn();
		//burninporn();
		//test5();
		//burninfood();
		//topicfood();
		
		//pornT(Integer.valueOf(args[0]));
		//pornT(Integer.valueOf(50));
		
		
		//ppxpornNolink(args[0],Integer.valueOf(args[1]),Integer.valueOf(args[2]));
		
		//ppxpornNolink("p1",100,8);
		//polseb();
	
	}

	public static void polseb() {

		PracticalInference pi = new PracticalInference();

		pi.directory = "polseb";
		pi.save_prefix = "100";
		pi.T=100;
		pi.TRAINING_SHARE = 1.0;
		pi.delta_fix = 10;
		pi.BATCHSIZE = 128;
		pi.BATCHSIZE_GROUPS = 128;
		pi.RUNS = 100;
		pi.BURNIN = 0;
		pi.alpha_1 = 0.1;
		pi.MIN_DICT_WORDS = 100;
		pi.INIT_RAND = 1;
		pi.BURNIN_DOCUMENTS=1;
		pi.SAMPLE_ALPHA=1;
		pi.rhokappa=pi.rhokappa_document = 0.5;


		pi.initialise();
		pi.run();

}
	
	public static void food8() {

			PracticalInference pi = new PracticalInference();

			pi.directory = "food3";
			pi.save_prefix = "topic8b";
			pi.T=8;
			pi.TRAINING_SHARE = 1.0;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 64;
			pi.BATCHSIZE_GROUPS = 64;
			pi.RUNS = 100;
			pi.BURNIN = 10;
			pi.alpha_1 = 0.1;
			pi.MIN_DICT_WORDS = 1;
			pi.BURNIN_DOCUMENTS=10;
			pi.SAMPLE_ALPHA=1;
			pi.rhokappa=pi.rhokappa_document = 0.5;


			pi.initialise();
			pi.run();

	}
	public static void food25() {


			PracticalInference pi = new PracticalInference();

			pi.directory = "food3";
			pi.save_prefix = "topic25b";
			pi.T=25;
			pi.TRAINING_SHARE = 1.0;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 128;
			pi.BATCHSIZE_GROUPS = 128;
			pi.RUNS = 200;
			pi.BURNIN = pi.BURNIN_DOCUMENTS=0;
			pi.SAMPLE_ALPHA=1;
			pi.rhokappa=pi.rhokappa_document = 0.5;
			
			//new parameters:
			pi.directory = "food3";
			pi.save_prefix = "topic25c";
			pi.T=15;
			pi.TRAINING_SHARE = 1.0;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 8;
			pi.BATCHSIZE_GROUPS = 8;
			pi.RUNS = 200;
			pi.INIT_RAND=0;
			pi.BURNIN = pi.BURNIN_DOCUMENTS=0;
			pi.SAMPLE_ALPHA=1;
			pi.rhokappa=pi.rhokappa_document = 0.5;


			pi.initialise();
			pi.run();

	}
		
	public static void pornT(int T) {
		

			PracticalInference pi = new PracticalInference();

			pi.directory = "porn_full3";
			pi.T=T;
			pi.save_prefix = "faster_"+pi.T+"_";
			pi.MIN_DICT_WORDS = 100;
			pi.TRAINING_SHARE = 1;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 69;
			pi.BATCHSIZE_GROUPS = 69;
			//pi.gamma = 10;
			pi.alpha_0 = 0.1;
			pi.beta_0 = 0.01;
			pi.RUNS = 200;
			pi.SAMPLE_ALPHA=1;
			pi.INIT_RAND=1;
			pi.BURNIN = pi.BURNIN_DOCUMENTS = 10;
			pi.rhokappa=pi.rhokappa_document=pi.rhokappa_group=0.5;
			//pi.rhos=10;
			//pi.rhos_document=1;
			//pi.rhos_group = 10;
			//pi.rhotau = 1000;
			//pi.rhotau_document = 10;
			//pi.rhotau_group = 1000;

			
			pi.initialise();
			pi.run();

	}


	
	public static void lkml50() {
		Thread thread = new Thread() {	    public void run() {

			PracticalInference pi = new PracticalInference();

			pi.directory = "test5";
			pi.save_prefix = "lkml50c";
			pi.T=50;
			pi.TRAINING_SHARE = 1;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 4096;
			pi.BATCHSIZE_GROUPS = 4096;
			pi.RUNS = 200;
			pi.INIT_RAND=1;
			pi.BURNIN = pi.BURNIN_DOCUMENTS=10;
			pi.SAMPLE_ALPHA = 1000;
			pi.rhokappa=pi.rhokappa_document = 0.5;


			pi.initialise();
			pi.run();
		}};

		thread.start();
	}
	
	public static void food8ppx() {
		Thread thread = new Thread() {	    public void run() {
			
			
			//int[] batchsizes = {4096,2048,1024,512,256,128,64,32,16,8,4,2,1};
			int[] batchsizes = {8};
			Text ppx_file = new Text();

			
			//ppx_file.write(ppxfilename , "", false);
			
			for (int bs : batchsizes) {
				
				PracticalInference pi = new PracticalInference();
				
				pi.directory = "food3";
				pi.save_prefix = "";
				pi.T=8;
				pi.TRAINING_SHARE = 0.8;
				pi.delta_fix = 10;
				pi.BATCHSIZE = 4096;
				pi.BATCHSIZE_GROUPS = 16;
				pi.RUNS = 200;
				pi.BURNIN = 0;
				pi.alpha_1 = 0.1;
				pi.MIN_DICT_WORDS = 1;
				pi.BURNIN_DOCUMENTS=0;
				pi.SAMPLE_ALPHA=1;
				pi.rhokappa=pi.rhokappa_document = 0.5;
			pi.BATCHSIZE = bs;
			pi.BATCHSIZE_GROUPS = bs;
			String ppxfilename = "/home/c/ppx_test2_"+pi.directory+"_"+pi.T;

			
			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				ppx_file.writeLine(ppxfilename, bs + " " + i + " " + pi.perplexity()+ " "+ ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime(), true);
				
				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();


				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

			}

		}};

		thread.start();
	}
	

	public static void food8learnppx() {
		Thread thread = new Thread() {	    public void run() {
			
			//wait till we have optimal batch size
			double[] learningrate = {0.9,0.5};
			//int[] batchsizes = {8};
			Text ppx_file = new Text();
			
			PracticalInference pi = new PracticalInference();
			
			pi.directory = "food3";
			pi.save_prefix = "food8learn";
			pi.T=8;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 10;
			pi.BATCHSIZE = 25;
			pi.BATCHSIZE_GROUPS = 8;
			pi.RUNS = 200;
			pi.BURNIN = pi.BURNIN_DOCUMENTS=0;
			pi.rhokappa=pi.rhokappa_document = 0.5;
			
			String ppxfilename = "/home/c/ppx_lr_"+pi.directory+"_"+pi.T;
			ppx_file.write(ppxfilename , "", false);
			
			for (double lr : learningrate) {
				pi.rhokappa=pi.rhokappa_document = lr;
			
			
			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				ppx_file.writeLine(ppxfilename, lr + " " + i + " " + pi.perplexity(), true);
				
				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();


				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

			}

		}};

		thread.start();
	}

	public static void topicfood() {

		PracticalInference pi = new PracticalInference();

		pi.directory = "food2";
		pi.T=25;
		pi.TRAINING_SHARE = 1.0;
		pi.delta_fix = 10;
		pi.BATCHSIZE = 8;
		pi.BATCHSIZE_GROUPS = 8;
		pi.RUNS = 1000;
		pi.BURNIN = pi.BURNIN_DOCUMENTS=0;
		pi.rhokappa=pi.rhokappa_document = 0.5;


		pi.initialise();
		pi.run();
	}

	public static void topicporn() {
		Thread thread = new Thread() {	    public void run() {

		PracticalInference pi = new PracticalInference();

		pi.directory = "porn_full3";
		pi.save_prefix = "fas";
		pi.T=25;
		pi.MIN_DICT_WORDS = 100;
		pi.TRAINING_SHARE = 0.8;
		pi.delta_fix = 0;
		pi.BATCHSIZE = 4;
		pi.BATCHSIZE_GROUPS = 4;
		//pi.gamma = 10;
		pi.beta_0 = 0.1;
		pi.RUNS = 200;
		pi.SAMPLE_ALPHA=1000;
		pi.BURNIN = 10;
		pi.BURNIN_DOCUMENTS=10;
		pi.rhokappa=pi.rhokappa_document = 0.5;
		
		Text ppx_file = new Text();
		String ppxfilename = "/home/c/ppx_lr_"+pi.directory+"_"+pi.T;
		ppx_file.write(ppxfilename , "", false);

		pi.initialise();
		

		for (int i=0;i<pi.RUNS;i++) {

			System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

			ppx_file.writeLine(ppxfilename, pi.BATCHSIZE + " " + i + " " + pi.perplexity(), true);
			
			pi.rhot_step++;
			//get step size
			pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
			pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

			int progress = pi.M / 50;
			if (progress==0) progress = 1;
			for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
				if(m%progress == 0) {
					System.out.print(".");
				}

				pi.inferenceDoc(m);
			}
			System.out.println();

			pi.updateHyperParameters();


			if (pi.rhot_step%pi.SAVE_STEP==0) {
				//store inferred variables
				System.out.println("Storing variables...");
				pi.save();
			}

		}

		double perplexity = pi.perplexity();

		System.out.println("Perplexity: " + perplexity);

		
		}};

		thread.start();
	
	}


	public static void test5() {

		PracticalInference pi = new PracticalInference();

		pi.directory = "test5";
		pi.T=50;
		pi.TRAINING_SHARE = 1.0;
		pi.delta_fix = 10;
		pi.BATCHSIZE = 4096;
		pi.BURNIN = 0;
		pi.BURNIN_DOCUMENTS = 0;
		pi.rhokappa=pi.rhokappa_document = 0.5;
		pi.RUNS = 200;

		pi.initialise();
		pi.run();
	}



	public static void kappaporn() {

		double[] kappas = {1.0/16,1.0/8,1.0/4,1.0/2};
		//int[] batchsizes = {8};
		Text ppx_file = new Text();

		for (double kappa : kappas) {

			PracticalInference pi = new PracticalInference();

			pi.BATCHSIZE=4096;
			pi.directory = "porn_full3";
			pi.T=25;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 0;
			pi.RUNS = 200;



			ppx_file.write("/home/c/kappa_test_"+pi.directory+"_"+pi.BATCHSIZE+"_"+pi.T , "", false);

			pi.rhokappa=pi.rhokappa_document=kappa;


			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				if (i > pi.BURNIN)
					ppx_file.writeLine("/home/c/ppx_test", kappa + " " + i + " " + pi.perplexity(), true);

				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();


				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

		}
	}

	public static void burninfood() {

		//int[] batchsizes = {8};
		Text ppx_file = new Text();

		int[] burnins = {64,32,16,8};
		for (int burnin : burnins) {

			PracticalInference pi = new PracticalInference();

			pi.BURNIN=0;
			pi.BURNIN_DOCUMENTS=0;
			pi.BATCHSIZE=burnin;
			pi.directory = "food2";
			pi.T=25;
			pi.beta_0=0.1;
			//pi.alpha_1=1;
			//pi.alpha_0=1;
			//pi.gamma=10;
			pi.MIN_DICT_WORDS=1;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 10;
			pi.RUNS = 200;
			pi.rhokappa=pi.rhokappa_document=0.5;
			
			pi.rhokappa_group = 0.5;

			String dest = "/home/c/batch_test_"+pi.directory+"_"+pi.BATCHSIZE+"_"+pi.T;

			ppx_file.write(dest , "", false);



			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				double ppx=pi.perplexity();
				ppx_file.writeLine(dest, burnin + " " + i + " " + ppx, true);

				System.out.println(ppx);

				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();

				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

		}
	}

	public static void burninporn() {

		//int[] batchsizes = {8};
		Text ppx_file = new Text();

		int[] burnins = {4,8,16,32,64};
		for (int burnin : burnins) {

			PracticalInference pi = new PracticalInference();

			pi.BURNIN=10;
			pi.BURNIN_DOCUMENTS=1;
			pi.BATCHSIZE=burnin;
			pi.directory = "porn_full3";
			pi.T=25;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 10;
			pi.RUNS = 200;
			pi.rhokappa=pi.rhokappa_document=0.5;


			String dest = "/home/c/burnin_test_"+pi.directory+"_"+pi.BATCHSIZE+"_"+pi.T;

			ppx_file.write(dest , "", false);



			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				ppx_file.writeLine(dest, burnin + " " + i + " " + pi.perplexity(), true);

				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();

				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

		}
	}

	

	public static void ppxpornNolink(String ds, int K, int bs) {

		
		Text ppx_file = new Text();


		
		
			PracticalInference pi = new PracticalInference();

			pi.directory = ds;
			pi.save_prefix = "nl";
			pi.T=K;
			pi.MIN_DICT_WORDS = 100;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 0;
			pi.BATCHSIZE = bs;
			pi.BATCHSIZE_GROUPS = bs;
			//pi.gamma = 10;
			pi.beta_0 = 0.1;
			pi.RUNS = 200;
			pi.SAMPLE_ALPHA=1000;
			pi.BURNIN = 0;
			pi.BURNIN_DOCUMENTS=0;
			pi.rhokappa=pi.rhokappa_document = 0.5;



			//ppx_file.write("/home/c/ppx_test_"+pi.dataset+"_"+pi.T , "", false);


			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				if (i > pi.BURNIN)
					ppx_file.writeLine("/home/c/ppx_testnl", pi.directory + " " + pi.T + " " + i + " " + pi.perplexity(), true);

				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();


				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

		
	}


	public static void ppxporn3() {

		int[] batchsizes = {4096,2048,1024,512,256,128,64,32,16,8,4,2,1};
		//int[] batchsizes = {8};
		Text ppx_file = new Text();

		for (int bs : batchsizes) {

			PracticalInference pi = new PracticalInference();

			pi.directory = "porn_full3";
			pi.T=25;
			pi.TRAINING_SHARE = 0.8;
			pi.delta_fix = 0;



			ppx_file.write("/home/c/ppx_test_"+pi.directory+"_"+pi.T , "", false);

			pi.BATCHSIZE = bs;
			pi.BATCHSIZE_GROUPS = bs;


			pi.readSettings();

			System.out.println("Reading dictionary...");
			pi.readDict();		

			System.out.println("Initialising parameters...");
			pi.getParameters();

			System.out.println("Processing documents...");

			pi.readDocs();

			System.out.println("Estimating topics...");

			for (int i=0;i<pi.RUNS;i++) {

				System.out.println("Run " + i + " (alpha_0 "+pi.alpha_0+" alpha_1 "+ pi.alpha_1+ " beta_0 " + pi.beta_0 + " gamma "+pi.gamma + " delta " + pi.delta[0]+ " epsilon " + pi.epsilon[0]);

				if (i > pi.BURNIN)
					ppx_file.writeLine("/home/c/ppx_test", bs + " " + i + " " + pi.perplexity(), true);

				pi.rhot_step++;
				//get step size
				pi.rhostkt_document = pi.rho(pi.rhos_document,pi.rhotau_document,pi.rhokappa_document,pi.rhot_step);
				pi.oneminusrhostkt_document = (1.0 - pi.rhostkt_document);

				int progress = pi.M / 50;
				if (progress==0) progress = 1;
				for (int m=0;m<Double.valueOf(pi.M)*pi.TRAINING_SHARE;m++) {
					if(m%progress == 0) {
						System.out.print(".");
					}

					pi.inferenceDoc(m);
				}
				System.out.println();

				pi.updateHyperParameters();


				if (pi.rhot_step%pi.SAVE_STEP==0) {
					//store inferred variables
					System.out.println("Storing variables...");
					pi.save();
				}

			}

			double perplexity = pi.perplexity();

			System.out.println("Perplexity: " + perplexity);

		}
	}



	


}

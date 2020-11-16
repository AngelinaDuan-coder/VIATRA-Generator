import readCSV as reader
import constants
import numpy as np

# graph stats for a collection of graphs
class GraphCollection:
    
    # init with path contrain files and number of files to read reader is imported from (readCSV)
    def __init__(self, path, number, name, shouldShuffle = True):
        self.out_ds = []
        self.nas = []
        self.mpcs = []
        self.nts = []
        self.name = name
       # self.tccs = []
        self.violations = []
        models = reader.readmultiplefiles(path, number, shouldShuffle)
        print(len(models))
        self.size = len(models)
        for i in range(len(models)):
            contents, out_d, na, mpc = reader.getmetrics(models[i])
            self.out_ds.append(out_d)
            self.nas.append(na)
            self.mpcs.append(mpc)
            if(constants.Node_TYPE_KEY in contents):
                self.nts.append(contents[constants.Node_TYPE_KEY])
           # if(constants.TCC_VALUE in contents):
            #    self.tccs.append(contents[constants.TCC_VALUE])
            if(constants.VIOLATION in contents):
                self.violations.append(contents[constants.VIOLATION][0])

#Graph stat for one graph
class GraphStat:
    # init with teh file name of the stat
    def __init__(self, filename):
        contents, self.out_d, self.na, self.mpc = reader.getmetrics(filename)
        self.numNodes = np.array(contents[constants.NUMBER_NODES])
        if constants.STATE_ID in contents:
            self.id = (contents[constants.STATE_ID])[0]
        if constants.Node_TYPE_KEY in contents:
            self.nodeTypeStat = contents[constants.Node_TYPE_KEY]
        if constants.VIOLATION in contents:
            self.violations = int(contents[constants.VIOLATION][0])
        #if(constants.TCC_VALUE_KEY in contents):
        #    self.tcc = contents[constants.TCC_VALUE_KEY]


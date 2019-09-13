```
    mypath = "/home/caiau/School/processing/individuals/a"
    w2tPath = "/home/caiau/School/data/web2textRelated"
    onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
    
    for f in onlyfiles[0:500]:
    classify(
    w2tPath + "/features/a/" + f + "_block_features.csv", 
    w2tPath + "/features/a/" + f + "_edge_features.csv", 
    w2tPath + "/labels/a/" + f
    )
```